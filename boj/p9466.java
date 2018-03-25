import java.io.*;
import java.util.StringTokenizer;

public class p9466 {

    static int arr[];
    static int visit[];
    static int s[];

    static int dfs(int x, int cnt, int step){
        if(visit[x] != 0) {
            if(step != s[x]){
                return 0;
            }
            return cnt-visit[x];
        }
        visit[x] = cnt;
        s[x] = step;
        return dfs(arr[x],cnt+1,step);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            int n = Integer.parseInt(br.readLine());
            arr = new int[n+1];
            visit = new int[n+1];
            s = new int[n+1];

            int count = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[j+1] = Integer.parseInt(st.nextToken());
            }
            for (int j = 1; j <= n; j++) {
                if(visit[j] == 0){
                    count+=dfs(j,1,j);
                }
            }
            sb.append(n-count);
            sb.append("\n");
        }
        pw.write(sb.toString());
        pw.close();

    }
}
