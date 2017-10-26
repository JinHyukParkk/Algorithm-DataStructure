import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 10. 25..
 */
public class p2178 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    int n,m;
    int arr[][];
    int dx[] = {0,0,-1,1};
    int dy[] = {-1,1,0,0};
    Queue<Point> queue = new LinkedList<Point>();
    void start(){
        try{
            input();
            sovle();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    void input() throws IOException{
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        n = Integer.parseInt(stringTokenizer.nextToken());
        m = Integer.parseInt(stringTokenizer.nextToken());
        arr = new int[n+1][m+1];
        for (int i = 1; i <= n; i++) {
            String string = bufferedReader.readLine();
            for (int j = 1; j <= m; j++) {
                arr[i][j] = string.charAt(j-1)-48;
            }
        }
    }
    void sovle(){
        queue.add(new Point(1, 1));
        while(!queue.isEmpty()){
            Point p = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if(0<nx && nx<=n && 0<ny && ny<=m && arr[nx][ny]==1){
                    queue.add(new Point(nx, ny));
                    arr[nx][ny] = arr[p.x][p.y]+1;
                }
            }
        }
        System.out.println(arr[n][m]);
    }



    public static void main(String[] args) {
        new p2178().start();
    }
}
class Point{
    int x,y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
