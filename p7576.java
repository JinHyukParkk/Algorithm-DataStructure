import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.LinkedList;

/**
 * Created by jinhyuk on 2017. 10. 20..
 */
public class p7576 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    int m,n;
    int arr[][];
    Queue<Node> q = new LinkedList<Node>();
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
        arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                if(arr[i][j] == 1){
                    q.add(new Node(i, j));
                }
            }
        }
        bufferedReader.close();
    }
    void sovle(){
        int dx[] = {0,0,-1,1};
        int dy[] = {1,-1,0,0};
        while(!q.isEmpty()){
            Node dNode = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = dNode.x + dx[i];
                int ny = dNode.y + dy[i];
                if(0 <= nx && nx < m && 0 <= ny && ny < n && arr[nx][ny] == 0){
                    arr[nx][ny] = arr[dNode.x][dNode.y]+1;
                    q.add(new Node(nx,ny));
                }
            }
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j]==0){
                    System.out.println("-1");
                    return;
                }
                ans = Math.max(ans, arr[i][j]);
            }
        }
        System.out.println(ans-1);
    }
    public static void main(String[] args) {
        new p7576().start();
    }
}
class Node{
    int x,y;
    Node(int x, int y){
        this.x = x;
        this.y = y;
    }
}