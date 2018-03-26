import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p1987 {

    static boolean visited[] = new boolean[26];
    static int dr[] = {0,0,-1,1};
    static int dc[] = {-1,1,0,0};
    static int arr[][];
    static int max_step = 0;
    static int r,c;


    static void dfs(int row, int col, int step) {
        max_step = max_step < step ? step : max_step;
        for (int i = 0; i < 4; i++) {
            int n_r = row+dr[i];
            int n_c = col+dc[i];
            if(n_r >= r || n_r < 0 || n_c >= c || n_c < 0) continue;
            if(visited[arr[n_r][n_c]]) continue;

            visited[arr[n_r][n_c]] = true;
            dfs(n_r,n_c,step+1);
            visited[arr[n_r][n_c]] = false;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");


        st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            String str = br.readLine();
            for (int j = 0; j < c; j++) {
                arr[i][j] = str.charAt(j)-'A';
            }
        }
        visited[arr[0][0]] = true;
        dfs(0,0,1);

        sb.append(max_step);
        System.out.println(sb.toString());

    }
}
