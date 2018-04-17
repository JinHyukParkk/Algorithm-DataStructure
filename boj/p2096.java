import java.io.*;
import java.util.StringTokenizer;

public class p2096 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        int n = Integer.parseInt(br.readLine());
        int arr[][] = new int[n+1][3];
        int dp[][] = new int[n+1][3];
        int dp1[][] = new int[n+1][3];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 1; i <=n; i++) {
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1])+arr[i][0];
            dp[i][1] = Math.max(Math.max(dp[i-1][0],dp[i-1][1]),dp[i-1][2])+arr[i][1];
            dp[i][2] = Math.max(dp[i-1][1],dp[i-1][2])+arr[i][2];

            dp1[i][0] = Math.min(dp1[i-1][0],dp1[i-1][1])+arr[i][0];
            dp1[i][1] = Math.min(Math.min(dp1[i-1][0],dp1[i-1][1]),dp1[i-1][2])+arr[i][1];
            dp1[i][2] = Math.min(dp1[i-1][1],dp1[i-1][2])+arr[i][2];
        }
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            max = Math.max(max,dp[n][i]);
            min = Math.min(min,dp1[n][i]);
        }
        sb.append(max+" "+min);
        bw.write(sb.toString());
        bw.close();


    }

}
