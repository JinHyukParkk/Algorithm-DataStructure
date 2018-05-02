import java.io.*;
import java.util.StringTokenizer;

public class p11060 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");
        
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int dp[] = new int[n+1];
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if(dp[i] == 0) continue;
            for (int j = 1; j <= a && i+j<n; j++) {
                if(dp[i+j]>dp[i]+1 || dp[i+j]==0)
                    dp[i+j] = dp[i]+1;
            }
        }
        br.close();
        if(dp[n-1] == 0){
            sb.append(-1);
        }else{
            sb.append(dp[n-1]-1);
        }
        bw.write(sb.toString());
        bw.close();
    }
}
