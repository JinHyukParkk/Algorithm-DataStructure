import java.io.*;
import java.util.StringTokenizer;

public class p10942 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n+1];
        boolean dp[][] = new boolean[n+1][n+1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if(i == j){
                    dp[j][i] = true;
                    continue;
                }
                if(i-1 == j){
                    if(arr[i] == arr[j]){
                        dp[j][i] = true;
                        continue;
                    }
                }
                if(arr[j] == arr[i] && dp[j+1][i-1]){
                    dp[j][i] = true;
                }
            }
        }
        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            if(dp[s][e]){
                sb.append(1+"\n");
            }else{
                sb.append(0+"\n");
            }
        }
        bw.write(sb.toString());
        bw.close();
    }
}