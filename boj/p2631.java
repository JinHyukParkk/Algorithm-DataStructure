import java.io.*;
import java.util.StringTokenizer;

public class p2631 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        int dp[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[j] > arr[i] && dp[j] < dp[i]+1){
                    dp[j] = Math.max(dp[j],dp[i]+1);
                }
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max  = Math.max(max,dp[i]+1);
        }
        sb.append(n-max);
        bw.write(sb.toString());
        bw.close();

    }

}
