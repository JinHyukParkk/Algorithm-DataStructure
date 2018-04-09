import java.io.*;
import java.util.StringTokenizer;

public class p1937 {

    static int n;
    static int max;
    static int arr[][];
    static int dp[][];
    static boolean visit[][];

    static int dx[] = {0,0,-1,1};
    static int dy[] = {-1,1,0,0};

    static void dfs(int y, int x){
        visit[y][x] = true;
        int value = 0;
        for (int i = 0; i < 4; i++) {
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx>=n || nx<0 || ny>=n || ny<0) continue;
            if(arr[ny][nx] < arr[y][x]){
                if(!visit[ny][nx]){
                    dfs(ny,nx);
                }
                if(value<dp[ny][nx]){
                    value = dp[ny][nx];
                }
            }
        }
        dp[y][x] = value + 1;
        max = Math.max(max,dp[y][x]);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        dp = new int[n][n];
        visit = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(!visit[i][j]){
                    dfs(i,j);
                }
            }
        }
        System.out.println(max);
    }
}
