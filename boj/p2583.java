import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class p2583 {
    static int m,n,k;
    static int arr[][];
    static int visit[][];
    static int area;
    static int dx[] = {0,0,-1,1};
    static int dy[] = {1,-1,0,0};
    static ArrayList<Integer> sol;
    static void check(int s_x,int s_y, int e_x, int e_y){
        for (int i = s_x; i < e_x; i++) {
            for (int j = s_y; j <e_y ; j++) {
                visit[j][i] = 1;
            }
        }
    }
    static void dfs(int y, int x){
        visit[y][x] = 1;
        area+=1;
        for (int i = 0; i < 4; i++) {
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(0<=nx && 0<=ny && nx<n && ny<m && visit[ny][nx] == 0){
                dfs(ny,nx);
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");
        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[m+1][n+1];
        visit = new int[m+1][n+1];
        sol = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int s_x = Integer.parseInt(st.nextToken());
            int s_y = Integer.parseInt(st.nextToken());
            int e_x = Integer.parseInt(st.nextToken());
            int e_y = Integer.parseInt(st.nextToken());
            check(s_x,s_y,e_x,e_y);
        }


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(visit[i][j] == 0){
                    dfs(i,j);
                    sol.add(area);
                    area = 0;
                }
            }
        }
        sb.append(sol.size()+"\n");
        Collections.sort(sol);
        for (int i = 0; i < sol.size(); i++) {
            sb.append(sol.get(i)+" ");
        }

        System.out.println(sb.toString());
    }
}
