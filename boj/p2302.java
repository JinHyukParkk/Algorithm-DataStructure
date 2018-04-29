import java.io.*;
import java.util.StringTokenizer;

public class p2302 {

    static int n;
    static int m;
    static int s[];
    static int dp[];


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        s = new int[m];
        dp = new int[n+1];
        for (int i = 0; i < m; i++) {
            s[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }

        int ans = 1;
        int temp = 0;
        for (int i = 0; i < m; i++) {
            ans *= dp[s[i]-temp-1];
            temp = s[i];
        }
        ans*=dp[n-temp];
        sb.append(ans);
        bw.write(sb.toString());
        bw.close();
    }
}
