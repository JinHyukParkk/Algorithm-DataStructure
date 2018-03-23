import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p10451 {

    static int arr[];
    static boolean visit[];


    static void dfs(int x){
        if(visit[x]) return;
        visit[x] = true;
        dfs(arr[x]);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");


        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            arr = new int[n+1];
            visit = new boolean[n+1];
            int count = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <=n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            for (int j = 1; j <=n; j++) {
                if(!visit[j]){
                    dfs(arr[j]);
                    count++;
                }
            }
            sb.append(count+"\n");
        }
        pw.write(sb.toString());
        pw.close();

    }
}
