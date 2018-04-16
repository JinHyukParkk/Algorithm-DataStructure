import java.io.*;
import java.util.StringTokenizer;

public class p2240{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        int arr[] = new int[t+1];
        int dp[][][] = new int [3][t+1][w+2];

        for (int i = 1; i <=t ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 1; i <=t ; i++) {
            if(arr[i] == 1){
                dp[1][i][0] = dp[1][i-1][0]+1;
            }else {
                dp[1][i][0] = dp[1][i-1][0];
            }

        }

        for (int i = 1; i <=t ; i++) {
            for (int j = 1; j <= w; j++) {
                if(arr[i] == 1){
                    dp[1][i][j] = Math.max(dp[1][i-1][j],dp[2][i-1][j-1])+1;
                    dp[2][i][j] = Math.max(dp[1][i-1][j-1],dp[2][i-1][j]);
                }else{
                    dp[1][i][j] = Math.max(dp[1][i-1][j],dp[2][i-1][j-1]);
                    dp[2][i][j] = Math.max(dp[1][i-1][j-1],dp[2][i-1][j])+1;
                }
            }
        }
        int max = 0;
        for (int i = 0; i <=w ; i++) {
            max = Math.max(max,dp[1][t][i]);
            max = Math.max(max,dp[2][t][i]);
        }

        System.out.println(max);
    }
}
