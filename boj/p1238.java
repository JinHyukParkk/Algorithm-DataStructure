import java.io.*;
import java.net.Inet4Address;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class p1238 {

    static int n,m,x;
    static int arr[][];
    static int arr1[][];
    static int cost[];
    static int total[];
    static final int INF = 1000*100+1;

    static void di(int s,int x[][]){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.offer(s);
        x[s][s] = 0;
        cost[s] = 0;
        while(!pq.isEmpty()){
            int nx = pq.poll();
            for (int i = 1; i <= n; i++) {
                if(cost[i] > cost[nx] + x[nx][i]){
                    cost[i] = cost[nx] + x[nx][i];
                    pq.offer(i);
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            total[i] += cost[i];
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());

        arr = new int[n+1][n+1];
        arr1 = new int[n+1][n+1];
        cost = new int[n+1];
        total = new int[n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = arr1[i][j]= INF;
            }
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            arr[a][b] = arr1[b][a] = v;
        }
        br.close();

        Arrays.fill(cost,INF);
        di(x,arr1);
        Arrays.fill(cost,INF);
        di(x,arr);
        int max = 0;
        for (int i = 1; i <= n; i++) {
            max = Math.max(max,total[i]);
        }
        sb.append(max);
        bw.write(sb.toString());
        bw.close();

    }

}
