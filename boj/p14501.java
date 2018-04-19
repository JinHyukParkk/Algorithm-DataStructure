import java.io.*;
import java.util.StringTokenizer;

public class p14501 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        int n = Integer.parseInt(br.readLine());

        int arr[][] = new int[n+1][2];
        int dp[] = new int[n+1];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            if(i+arr[i][0] <= n+1){
                dp[i] = arr[i][1];
            }
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if(j+arr[j][0] <= i){
                    dp[i] = Math.max(dp[i],dp[j]+arr[i][1]);
                }
            }
        }
        int max = 0;
        for (int i = 1; i <= n; i++) {
            if(i+arr[i][0] <= n+1){
                max = Math.max(max,dp[i]);
            }
        }
        sb.append(max);
        bw.write(sb.toString());
        bw.close();

    }
}
