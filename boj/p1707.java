import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class p1707 {


    static int visited[];
    static ArrayList<Integer> al[];
    static void dfs(int x, int c){
        visited[x] = c;
        for (int i : al[x]) {
            if(visited[i] == 0) {
                dfs(i,3-c);
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            visited = new int[v+1];

            al = new ArrayList[v+1];
            for (int j = 0; j <= v; j++) {
                al[j] = new ArrayList<Integer>();
            }

            for (int j = 0; j < e; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                al[a].add(b);
                al[b].add(a);
            }
            for (int j = 1; j <= v; j++) {
                if(visited[j] == 0){
                    dfs(j,1);
                }
            }
            boolean ans = true;
            for (int j = 1; j <=v; j++) {
                for (int k : al[j]) {
                    if(visited[j] == visited[k]){
                        ans = false;
                    }
                }
            }

            sb.append(ans?"YES\n":"NO\n");
        }

        pw.write(sb.toString());
        pw.close();

    }
}
