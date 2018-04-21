import java.io.*;
import java.util.StringTokenizer;

public class p10164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        br.close();

        int dp[][] = new int[n+1][m+1];

        dp[0][1] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        if (k == 0){
            sb.append(dp[n][m]);
        }else{
            int a = k/m+(k%m>0?1:0);
            int b = k-(a-1)*m;
            sb.append(dp[a][b] * dp[n-a+1][m-b+1]);
        }
        bw.write(sb.toString());
        bw.close();
    }
}
