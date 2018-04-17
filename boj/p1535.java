import java.io.*;
import java.util.StringTokenizer;

public class p1535 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        int n = Integer.parseInt(br.readLine());
        int arr[][] = new int[n+1][2];
        int dp[][] = new int[n+1][101];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i][0] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i <= n; i++) {
            dp[i][100-arr[i][0]] = arr[i][1];
            for (int j = 1; j <= 100; j++) {
                if(j+arr[i][0] <= 100 && dp[i-1][j+arr[i][0]] != 0){
                    dp[i][j] = Math.max(dp[i-1][j+arr[i][0]]+arr[i][1],dp[i-1][j]);
                }else {
                    dp[i][j] = Math.max(dp[i][j],dp[i-1][j]);
                }

            }
        }
        int max = 0;
        for (int i = 1; i <= 100; i++) {
            max = Math.max(max,dp[n][i]);

        }
        sb.append(max);
        bw.write(sb.toString());
        bw.close();
    }
}
