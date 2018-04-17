import java.io.*;
import java.util.StringTokenizer;

public class p1965 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        int dp[] = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j <i; j++) {
                if(arr[j] < arr[i] && dp[i] < dp[j]+1){
                    dp[i] = dp[j]+1;
                }
            }
            max = Math.max(dp[i],max);
        }
        sb.append(max);
        bw.write(sb.toString());
        bw.close();
    }
}
