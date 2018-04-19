import java.io.*;
import java.util.StringTokenizer;

public class p1904 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        int n = Integer.parseInt(br.readLine());
        br.close();
        long dp[] = new long[n+1];

        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1]+dp[i-2];
            dp[i]%=15746;
        }
        sb.append(dp[n]);
        bw.write(sb.toString());
        bw.close();
    }
}
