import java.io.*;
import java.util.StringTokenizer;

public class p6603 {

    static int arr[];
    static int cnt;
    static StringBuilder sb = new StringBuilder("");
    static int n;
    static void dfs(int v, String str){
        if(cnt == 6){
            sb.append(str + "\n");
        }else {
            for (int i = v+1; i < n; i++) {
                ++cnt;
                dfs(i,str+arr[i]+" ");
            }
        }
        --cnt;


    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;



        while(true){
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            if(n == 0) break;

            arr = new int[n+1];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < n; i++) {
                cnt = 1;
                dfs(i,arr[i] + " ");
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.close();
    }

}
