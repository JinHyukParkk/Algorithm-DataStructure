import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p2589 {

    static char arr[][];
    static boolean visit[][];
    static int r,c;
    static int ans = 0;
    static int dx[] = {0,0,-1,1};
    static int dy[] = {-1,1,0,0};

    static class Node{
        int x,y,cnt;
        Node(int x, int y, int cnt){
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }
    static void bfs(int x, int y){
        Queue<Node> q = new LinkedList<Node>();
        q.offer(new Node(x,y,0));
        visit[x][y] = true;
        while(!q.isEmpty()){
            Node cur = q.poll();
            ans = Math.max(ans,cur.cnt);
            for (int i = 0; i < 4; i++) {
                int nx = cur.x+dx[i];
                int ny = cur.y+dy[i];
                if(nx<0 || c<=nx || ny<0 || r<=ny) continue;
                if(!visit[nx][ny] && arr[nx][ny] == 'L'){
                    visit[nx][ny] = true;
                    q.offer(new Node(nx,ny,cur.cnt+1));
                }
            }

        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        st = new StringTokenizer(br.readLine());
        c = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        arr = new char[c][r];
        for (int i = 0; i < c; i++) {
            String str = br.readLine();
            for (int j = 0; j < r; j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                if(arr[i][j] == 'L'){
                    visit = new boolean[c][r];
                    bfs(i,j);
                }
            }
        }
        sb.append(ans);
        bw.write(sb.toString());
        bw.close();
    }

}
