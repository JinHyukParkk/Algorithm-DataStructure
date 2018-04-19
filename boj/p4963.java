import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class p4963 {
    static int w,h;
    static int arr[][];
    static boolean visit[][];
    static int dh[] = {0,0,1,-1,1,1,-1,-1};
    static int dw[] = {-1,1,0,0,1,-1,-1,1};

    static void dfs(int a, int b){
        visit[a][b] = true;
        for (int i = 0; i < 8; i++) {
            int nh = a+dh[i];
            int nw = b+dw[i];
            if(nh<0 || nh>=h || nw<0 || nw>=w) continue;
            if(arr[nh][nw]==1 && !visit[nh][nw]){
                dfs(nh,nw);
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        int count =0;
        while(true){
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if(w==0 && h==0) break;
            arr = new int[h+1][w+1];
            visit = new boolean[h+1][w+1];
            count = 0;
            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if(arr[i][j] == 1 && !visit[i][j]){
                        dfs(i,j);
                        count++;
                    }
                }
            }
            sb.append(count+"\n");
        }
        br.close();
        bw.write(sb.toString());
        bw.close();

    }
}
