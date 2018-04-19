import java.io.*;
import java.util.StringTokenizer;

public class p1328 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");


        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        long dp[][][] = new long[104][104][104];

        for (int i = 1; i <= n; i++) {
            dp[i][1][i] = 1;
            dp[i][i][1] = 1;
        }
        for (int i = 2; i <=n ; i++) {
            for (int j = 1; j <= l; j++) {
                for (int k = 1; k <= r; k++) {
                    dp[i][j][k] = dp[i-1][j][k]*(i-2)+dp[i-1][j-1][k]+dp[i-1][j][k-1];
                    dp[i][j][k] = dp[i][j][k]%1000000007;
                }
            }
        }

        sb.append(dp[n][l][r]);
        bw.write(sb.toString());
        bw.close();
    }
}
