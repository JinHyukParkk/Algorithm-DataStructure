import java.io.*;
import java.util.StringTokenizer;

public class p14500 {

    static int col,row;
    static int arr[][];
    static boolean visit[][];
    static int dx[] = {0,0,-1,1};
    static int dy[] = {1,-1,0,0};
    static int ans;
    static void dfs(int x, int y, int cnt, int sum){
        if(cnt == 4){
            ans = Math.max(ans,sum);
            return;
        }
        visit[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx<0 || ny<0 || col<=nx || row<=ny || visit[nx][ny]) continue;
            dfs(nx,ny,cnt+1,sum+arr[nx][ny]);
        }
        visit[x][y] = false;
    }
    static int case5(int c, int r){
        int max = -1;
        boolean c_t1 = c+1<col && r+2<row;
        boolean c_t2 = c+2<col && r+1<row;
        if(c_t1){
            int sum = arr[c+1][r]+arr[c+1][r+1]+arr[c+1][r+2]+arr[c][r+1];
            max = Math.max(max,sum);
            sum = arr[c][r]+arr[c][r+1]+arr[c][r+2]+arr[c+1][r+1];
            max = Math.max(max,sum);
        }
        if(c_t2){
            int sum = arr[c][r]+arr[c+1][r]+arr[c+2][r]+arr[c+1][r+1];
            max = Math.max(max,sum);
            sum = arr[c+1][r]+arr[c][r+1]+arr[c+1][r+1]+arr[c+2][r+1];
            max = Math.max(max,sum);
        }
        return max;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");


        st = new StringTokenizer(br.readLine());

        col = Integer.parseInt(st.nextToken());
        row = Integer.parseInt(st.nextToken());
        arr = new int[col][row];
        visit = new boolean[col][row];
        for (int i = 0; i < col; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < row; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                dfs(i,j,1,arr[i][j]);
                ans = Math.max(ans,case5(i,j));
            }
        }
        sb.append(ans);
        bw.write(sb.toString());
        bw.close();
    }
}
