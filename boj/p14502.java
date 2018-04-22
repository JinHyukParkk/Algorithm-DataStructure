import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p14502 {
    static int col,row;
    static int arr[][];
    static int temp[][];
    static boolean visit[][];
    static ArrayList<Virus> al = new ArrayList<Virus>();
    static int max;
    static int dx[] = {0,0,-1,1};
    static int dy[] = {1,-1,0,0};

    static class Virus{
        int col;
        int row;
        Virus(int c,int r){
            this.col = c;
            this.row = r;
        }
    }

    static int cal(){
        int count =0;
        for (int i = 1; i <= col; i++) {
            for (int j = 1; j <= row; j++) {
                if(temp[i][j] == 0){
                    count++;
                }
            }
        }
        return count;
    }

    static void copy(){
        for (int i = 1; i <= col; i++) {
            for (int j = 1; j <= row; j++) {
                temp[i][j] = arr[i][j];
            }
        }
    }
    static void bfs(){
        Queue<Virus> q = new LinkedList<Virus>();
        for(Virus a : al){
            q.offer(a);
        }
        while(!q.isEmpty()){
            Virus n = q.poll();
            for (int i = 0; i < 4; i++) {
                int nc = n.col+dx[i];
                int nr = n.row+dy[i];
                if (nc<1 || nr < 1 || col<nc || row<nr || temp[nc][nr] != 0) continue;
                temp[nc][nr] = 2;
                q.offer(new Virus(nc,nr));
            }

        }

    }
    static void dfs(int c, int r, int cnt){
        visit[c][r] = true;
        arr[c][r] = 1;
        if(cnt == 3){
            copy();
            bfs();
            max = Math.max(max,cal());
            visit[c][r] = false;
            arr[c][r] = 0;
            return;
        }

        for (int i = c; i <= col; i++) {
            for (int j = 1; j <= row; j++) {
                if(arr[i][j] == 0 && !visit[i][j]){
                    dfs(i,j,cnt+1);
                }
            }
        }
        visit[c][r] = false;
        arr[c][r] = 0;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        st = new StringTokenizer(br.readLine());

        col = Integer.parseInt(st.nextToken());
        row = Integer.parseInt(st.nextToken());

        arr = new int[col+1][row+1];
        temp = new int[col+1][row+1];
        visit = new boolean[col+1][row+1];
        for (int i = 1; i <= col; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= row; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 2) al.add(new Virus(i,j));
            }
        }
        br.close();

        for (int i = 1; i <= col; i++) {
            for (int j = 1; j <= row; j++) {
                if(arr[i][j] == 0){
                    dfs(i,j,1);
                }
            }
        }
        sb.append(max);
        bw.write(sb.toString());
        bw.close();
    }
}
