import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by jinhyuk on 2017. 10. 26..
 */
public class p10216 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    int n;
    ArrayList<Point> arrayList;
    Queue<Point> q;

    void start(){
        try{
            int tc = Integer.parseInt(bufferedReader.readLine());
            for (int i = 0; i < tc; i++) {
                input();
                sovle();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine());
        arrayList = new ArrayList<Point>();
        q = new LinkedList<Point>();
        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());
            int z = Integer.parseInt(stringTokenizer.nextToken());
            arrayList.add(new Point(x,y,z));
        }
    }
    void sovle(){
        int ans = 0;
        for (Point a : arrayList) {
            if(a.check) continue;
            a.check = true;
            q.add(new Point(a.x,a.y,a.r));
            while(!q.isEmpty()){
                Point cur = q.poll();
                for(Point b : arrayList){
                    if(adjCheck(cur,b) && !b.check){
                        b.check = true;
                        q.add(b);
                    }
                }
            }
            ans++;
        }
        System.out.println(ans);
    }
    boolean adjCheck(Point a, Point b){
        int dis = (int)Math.pow(a.x-b.x,2) + (int)Math.pow(a.y-b.y,2);
        return dis <= (int)Math.pow(a.r+b.r,2);
    }

    public static void main(String[] args) {
        new p10216().start();
    }
}
class Point{
    int x,y,r;
    boolean check = false;
    Point(int x, int y, int r){
        this.x = x;
        this.y = y;
        this.r = r;
    }
}

