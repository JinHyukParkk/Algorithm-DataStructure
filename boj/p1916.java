import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class p1916 {

    static int n,m;
    static int arr[][];
    static long cost[];
    static boolean visit[];
    static int s,e;

    static void di(int x){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.offer(x);
        cost[x] = 0;
        while(!pq.isEmpty()){
            int be = pq.poll();
            for (int i = 1; i <= m; i++) {
                if(cost[i] > cost[be]+arr[be][i]){
                    cost[i] = cost[be]+arr[be][i];
                    pq.offer(i);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        m = Integer.parseInt(br.readLine());
        arr = new int[m+1][m+1];
        cost = new long[m+1];
        visit = new boolean[m+1];

        n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= m; i++) {
            cost[i] = Integer.MAX_VALUE;
            for (int j = 1; j <= m; j++) {
                arr[i][j] = Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            arr[from][to] = Math.min(arr[from][to],cost);
        }
        st = new StringTokenizer(br.readLine());
        s = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        br.close();

        di(s);
        sb.append(cost[e]);
        bw.write(sb.toString());
        bw.close();



    }
}
