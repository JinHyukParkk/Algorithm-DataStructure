import java.io.*;
import java.util.StringTokenizer;

public class p2294 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        int n,k;
        st= new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        int arr[] = new int[n];
        int dp[] = new int[k+1];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        dp[0] = 0;
        for (int i = 1; i <= k; i++) {
            dp[i] = 100001;
            for (int j = 0; j < n; j++) {
                if(arr[j]<=i){
                    dp[i] = Math.min(dp[i-arr[j]]+1,dp[i]);
                }
            }
        }
        if(dp[k] == 100001){
            sb.append(-1);
        }else{
            sb.append(dp[k]);
        }
        bw.write(sb.toString());
        bw.close();
    }
}
