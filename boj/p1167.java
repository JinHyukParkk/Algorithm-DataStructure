import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.LinkedList;

/**
 * Created by jinhyuk on 2017. 10. 10..
 */

public class p1167 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    int n;
    List<Edge>[] a;
    Boolean check[];

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
        a = (List<Edge>[]) new List[n+1];
        for (int i = 1; i <= n; i++) {
            a[i] = new ArrayList<Edge>();
        }
        check = new Boolean[n+1];
        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());
            while(y != -1){
                int z = Integer.parseInt(stringTokenizer.nextToken());
                a[x].add(new Edge(y,z));
                y = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
    }
    void sovle(){
        int[] dist = bfs(1);
        int start = 1;
        for (int i = 2; i <=n ; i++) {
            if(dist[i]>dist[start]){
                start = i;
            }
        }
        dist = bfs(start);
        int ans = dist[1];
        for (int i = 2; i <= n; i++) {
            if(ans<dist[i]){
                ans = dist[i];
            }
        }
        System.out.println(ans);
}
    int[] bfs(int start){
        boolean[] check = new boolean[n+1];
        int[] dist = new int[n+1];
        Queue<Integer> q = new LinkedList<Integer>();
        check[start] = true;
        q.add(start);
        while(!q.isEmpty()){
            int x = q.poll();
            for(Edge e : a[x]){
                int y = e.to;
                int cost = e.cost;
                if(!check[y]){
                    dist[y] = dist[x] + cost;
                    q.add(y);
                    check[y] = true;
                }
            }
        }
        return dist;
    }
    public static void main(String[] args) {
        new p1167().start();
    }
}
class Edge{
    public int to;
    public int cost;
    Edge(int to, int cost){
        this.to = to;
        this.cost = cost;
    }
}
