import java.io.*;
import java.util.StringTokenizer;

public class p11048 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        st = new StringTokenizer(br.readLine());

        int c = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int arr[][] = new int[c][r];
        int dp[][] =  new int[c][r];

        for (int i = 0; i < c; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < r; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0] = arr[0][0];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                if(i-1 >= 0){
                    dp[i][j] = Math.max(dp[i][j],dp[i-1][j]+arr[i][j]);
                }
                if(j-1 >= 0){
                    dp[i][j] = Math.max(dp[i][j],dp[i][j-1]+arr[i][j]);
                }
                if(i-1 >= 0 && j-1 >= 0){
                    dp[i][j] = Math.max(dp[i][j],dp[i-1][j-1]+arr[i][j]);
                }
            }
        }

        sb.append(dp[c-1][r-1]);
        bw.write(sb.toString());
        bw.close();

    }
}
