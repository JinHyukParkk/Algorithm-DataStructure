import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p9084 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        int dp[] = new int[10001];
        int co[];
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            Arrays.fill(dp,0);
            int n = Integer.parseInt(br.readLine());
            co = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                co[j] = Integer.parseInt(st.nextToken());
            }
            int m = Integer.parseInt(br.readLine());
            for (int j = 0; j < n; j++) {
                dp[co[j]]++;
                for (int k = co[j]+1; k <= m; k++) {
                    dp[k] += dp[k-co[j]];
                }

            }
            sb.append(dp[m]+"\n");
        }
        bw.write(sb.toString());
        bw.close();
    }
}
