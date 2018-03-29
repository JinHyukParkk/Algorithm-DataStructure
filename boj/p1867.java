import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class p1867 {

    static int n;
    static int a[];
    static int b[];
    static int visit[];
    static ArrayList<Integer> adj[];
    static int vcnt;


    static int dfs(int x){
        if(visit[x]==vcnt) return 0;
        visit[x] = vcnt;
        for(int next : adj[x]){
            if(b[next] == 0 || dfs(b[next]) > 0){
                a[x] = next;
                b[next] = x;
                return 1;
            }
        }
        return 0;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");


        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        adj = new ArrayList[n+1];
        for (int i = 0; i < n+1; i++) {
         adj[i] = new ArrayList<Integer>();
        }
        a = new int[n+1];
        b = new int[n+1];
        visit = new int[n+1];
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            adj[x].add(y);
        }

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            vcnt++;
            ans+=dfs(i);
        }
        sb.append(ans);
        bw.write(sb.toString());
        bw.close();

    }

}
