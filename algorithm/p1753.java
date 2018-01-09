import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 11. 1..
 */
public class p1753 {
    Myscanner sc = new Myscanner();
    PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    StringBuilder sb = new StringBuilder("");
    int v,e;
    int start;
    ArrayList<ArrayList<Integer>> w = new ArrayList<>();
    int dist[];
    final int INF = 5000000;

    void start(){
        try{
            input();
            sovle();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    void input() throws IOException {
        v = sc.nextInt();
        dist = new int[v+1];
        e = sc.nextInt();
        Arrays.fill(dist,INF);
        for (int i = 0; i < v+1; i++) {
            w.add(new ArrayList<>());
        }
        start = sc.nextInt();
        for (int i = 0; i < e; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            w.get(x).add(y*11+z);
        }
    }
    void sovle(){
        PriorityQueue<Point> pq = new PriorityQueue<>();
        dist[start] = 0;
        pq.add(new Point(start, dist[start]));
        while(!pq.isEmpty()){
            int cost = pq.peek().dist;
            int here = pq.peek().node;
            pq.poll();
            if(dist[here] < cost){
                continue;
            }
            for(int x : w.get(here)){
                int adjNode = x/11;
                int weight = x%11;
                if(dist[adjNode] > dist[here] + weight){
                    dist[adjNode] = dist[here] + weight;
                    pq.add(new Point(adjNode,dist[adjNode]));
                }
            }
        }
        for (int i = 1; i < v+1; i++) {
            sb.append(dist[i]<INF?dist[i]+"\n":"INF"+"\n");
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        new p1753().start();
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
    class Point implements Comparable<Point>{
        int node;
        int dist;

        Point(int node, int dist){
            this.node = node;
            this.dist = dist;
        }
        @Override
        public int compareTo(Point o){
            return this.dist < o.dist? -1:1;
        }
    }
}

