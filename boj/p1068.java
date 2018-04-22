import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p1068 {
    static ArrayList<Integer> al[];
    static int root,r;
    static int count = 0;
    static void bfs(int s){
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(s);
        while(!q.isEmpty()){
            int next = q.poll();
            int cnt = 0;
            for(int a : al[next]){
                if(a != r){
                    q.offer(a);
                    cnt++;
                }
            }
            if(cnt==0) count++;

        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        int n = Integer.parseInt(br.readLine());
        al = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            al[i] = new ArrayList<Integer>();
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int node = Integer.parseInt(st.nextToken());
            if(node == -1){
                root = i;
            }else{
                al[node].add(i);
            }

        }
        r = Integer.parseInt(br.readLine());
        if(root != r) {
            bfs(root);
        }
        sb.append(count);
        bw.write(sb.toString());
        bw.close();


    }
}
