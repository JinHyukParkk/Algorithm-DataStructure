import java.io.*;
import java.util.*;

public class p2644 {

    static int n;
    static int cnt[];
    static ArrayList<Integer> al[];

    static void bfs(int s){
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(s);
        while(!q.isEmpty()){
            int n = q.poll();
            for(int x : al[n]){
                if(cnt[x] != 0) continue;
                q.offer(x);
                cnt[x] = cnt[n]+1;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        n = Integer.parseInt(br.readLine());
        cnt = new int[n+1];
        st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());
        al = new ArrayList[n+1];
        for (int i = 0; i <= n; i++) {
            al[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            al[a].add(b);
            al[b].add(a);
        }
        br.close();
        bfs(s);
        sb.append(cnt[e]==0?-1:cnt[e]);
        bw.write(sb.toString());
        bw.close();


    }
}
