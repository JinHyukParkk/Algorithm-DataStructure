import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class p5567 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        int ans = 0;
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        ArrayList<Integer> al[] = new ArrayList[n+1];
        boolean visit[] = new boolean[n+1];
        for (int i = 0; i <= n; i++) {
            al[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a == 1){
                ans++;
                visit[b] = true;
            }
            al[a].add(b);
            al[b].add(a);
        }
        visit[1] = true;
        for(int i : al[1]){
            for(int x : al[i]){
                if(!visit[x]){
                    ans++;
                    visit[x] = true;
                }
            }
        }
        sb.append(ans);
        bw.write(sb.toString());
        bw.close();
    }
}
