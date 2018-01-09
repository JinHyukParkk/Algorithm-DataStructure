import java.io.*;
import java.util.*;

/**
 * Created by jinhyuk on 2017. 11. 1..
 */
public class p1766 {
    Myscanner sc = new Myscanner();
    PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    StringBuilder sb = new StringBuilder("");

    int n,m;
    int indegree[];
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
        indegree = new int[n+1];
        graph = new LinkedList[n+1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new LinkedList<Integer>();
        }
        m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            graph[from].offer(to);
            indegree[to]++;
        }
    }
    void sovle(){
        Queue<Integer> q = new PriorityQueue<Integer>();
        for (int i = 1; i <= n; i++) {
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int zeroIndegree = q.poll();
            sb.append(zeroIndegree+" ");
            for(int node : graph[zeroIndegree]){
                indegree[node]--;
                if(indegree[node] == 0){
                    q.add(node);
                }
            }
        }
        out.println(sb.toString());
        out.flush();
    }

    public static void main(String[] args) {
        new p1766().start();
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

