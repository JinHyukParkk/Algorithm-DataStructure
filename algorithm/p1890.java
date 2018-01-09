import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 10. 27..
 */
public class p1890 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    int n;
    int arr[][];
    Queue<Point> q = new LinkedList<Point>();
    void start(){
        try{
            input();
            sovle();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine());
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
    }
    void sovle(){
        int count = 0;
        q.add(new Point(0,0));
        while(!q.isEmpty()){
            Point cur = q.poll();
            int p = arr[cur.x][cur.y];

            if(cur.x == n-1 && cur.y == n-1){
                count++;
                continue;
            }
            if(0<=cur.x+p && cur.x+p<n){
                q.add(new Point(cur.x+p,cur.y));
            }
            if(0<=cur.y+p && cur.y+p<n){
                q.add(new Point(cur.x,cur.y+p));
            }
        }
        System.out.println(count);

    }

    public static void main(String[] args) {
        new p1890().start();
    }
}
class Point{
    int x,y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

