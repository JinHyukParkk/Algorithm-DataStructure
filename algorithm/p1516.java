import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 11. 1..
 */
public class p1516 {
    Myscanner sc = new Myscanner();
    PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    StringBuilder sb = new StringBuilder("");
    int time[];
    int n;
    int indegree[];
    int res[];
    LinkedList<Integer> graph[];

    void start(){
        try{
            input();
            sovle();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    void input() throws IOException {
        n = sc.nextInt();
        time = new int[n+1];
        graph = new LinkedList[n+1];
        res = new int[n+1];
        indegree = new int[n+1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new LinkedList<Integer>();
        }
        for (int i = 1; i <= n; i++) {
            int t = sc.nextInt();
            time[i] = t;
            res[i] = t;
            while(true){
                int from = sc.nextInt();
                if(from == -1) break;
                graph[from].offer(i);
                indegree[i]++;
            }
        }
    }
    void sovle(){
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 1; i <= n; i++) {
            if(indegree[i] == 0){
                q.offer(i);
            }
        }
        while(!q.isEmpty()){
            int zeroIndegree = q.poll();
            for(int node : graph[zeroIndegree]){
                indegree[node]--;
                if(indegree[node] == 0){
                    q.offer(node);
                }
                res[node] = Math.max(res[node],res[zeroIndegree]+time[node]);
            }
        }
        for (int i = 1; i < n; i++) {
            sb.append(res[i]+"\n");
        }
        sb.append(res[n]);
        out.println(sb.toString());
        out.flush();
    }

    public static void main(String[] args) {
        new p1516().start();
    }
    class Myscanner {
        BufferedReader br;
        StringTokenizer st;

        Myscanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
