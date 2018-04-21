import java.io.*;
import java.util.StringTokenizer;

public class p9507 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        int n = Integer.parseInt(br.readLine());

        long dp[] = new long[70];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i < 70; i++) {
            for (int j = 1; j <= 4; j++) {
                dp[i]+=dp[i-j];
            }
        }
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            sb.append(dp[a]+"\n");
        }
        br.close();
        bw.write(sb.toString());
        bw.close();
    }
}
