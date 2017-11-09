import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 11. 3..
 */
public class p1504 {
    Myscanner sc = new Myscanner();
    PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    StringBuilder sb = new StringBuilder("");

    int v,e;
    int ch1,ch2;
    ArrayList<Ele> arrayList[];
    int dist[][];
    final int INF = 100000000;

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
        arrayList = new ArrayList[v+1];
        dist = new int[3][v+1];
        for (int i = 0; i < 3; i++) {
            Arrays.fill(dist[i],INF);
        }
        e = sc.nextInt();
        for (int i = 0; i <v+1; i++) {
            arrayList[i] = new ArrayList<Ele>();
        }
        for (int i = 0; i < e; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            arrayList[x].add(new Ele(y,z));
            arrayList[y].add(new Ele(x,z));
        }
        ch1 = sc.nextInt();
        ch2 = sc.nextInt();
    }
    void sovle(){
        dijkstra(1,0);
        dijkstra(ch1,1);
        dijkstra(ch2,2);
        int min = Math.min(dist[0][ch1]+dist[1][ch2]+dist[2][v],dist[0][ch2]+dist[2][ch1]+dist[1][v]);
        System.out.println(min<=INF?min:-1);
    }
    void dijkstra(int src, int idx){
        PriorityQueue<Ele> pq = new PriorityQueue<Ele>();
        pq.add(new Ele(src,0));
        dist[idx][src] = 0;
        while(!pq.isEmpty()) {
            Ele now = pq.poll();
            int cost = now.dist;
            int here = now.node;
            if (dist[idx][here] < cost) {
                continue;
            }
            for (Ele a : arrayList[here]) {
                int adjNode = a.node;
                int weight = a.dist;
                if (dist[idx][adjNode] > cost + weight) {
                    dist[idx][adjNode] = cost + weight;
                    pq.add(new Ele(adjNode, dist[idx][adjNode]));
                }
            }
        }
    }
    public static void main(String[] args) {
        new p1504().start();
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
    class Ele implements Comparable<Ele>{
        int node, dist;

        Ele(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }
        @Override
        public int compareTo(Ele o){
            return this.dist<o.dist? -1:1;
        }
    }
}

