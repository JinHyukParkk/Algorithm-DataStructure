import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p2098 {

    static int arr[][];
    static int dp[][];
    static int n;
    static final int INF = 1000000000;

    static int getPath(int cur, int visit){
        if(visit == (1<<n) -1){
            return arr[cur][1];
        }
        if(dp[cur][visit] >= 0){
            return dp[cur][visit];
        }
        int ret = INF;

        for (int i = 1; i <= n; i++) {
            int next = i;
            // 방문 했을 경우
            if((visit & (1 << (next-1))) != 0) continue;
            // cur에서 next로 갈 수 없는 경우
            if(arr[cur][next] == 0) continue;
            int path = arr[cur][next] + getPath(next, visit + (1 << (next-1)));
            ret = Math.min(ret,path);
        }
        return dp[cur][visit] = ret;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        n = Integer.parseInt(br.readLine());
        arr = new int[n+1][n+1];
        dp = new int[n+1][1<<n];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 안들렸을 때 값이 0이므로.
        for (int i = 1; i <= n; i++) {
            Arrays.fill(dp[i],-1);
        }



        sb.append(getPath(1, 1));
        bw.write(sb.toString());
        bw.close();
    }

}
