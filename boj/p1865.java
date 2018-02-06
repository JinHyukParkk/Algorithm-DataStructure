import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 11. 8..
 */
public class p1865 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter printWriter = new PrintWriter(new BufferedOutputStream(System.out));
    StringTokenizer stringTokenizer;
    StringBuilder stringBuilder = new StringBuilder("");

    int n,m,w;
    Ele[] arr;
    final int INF = 100000000;
    int totalEleCount;
    int srcList[];

    void start(){
        try{
            int tc = Integer.parseInt(bufferedReader.readLine());
            for (int i = 0; i < tc; i++) {
                input();
                solve();
            }
            printWriter.print(stringBuilder.toString());
            printWriter.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    void input() throws IOException{
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        n = Integer.parseInt(stringTokenizer.nextToken());
        m = Integer.parseInt(stringTokenizer.nextToken());
        w = Integer.parseInt(stringTokenizer.nextToken());
        totalEleCount = 2*m+w;
        int idx = -1;
        arr = new Ele[totalEleCount];
        for (int i = 0; i < m; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int s = Integer.parseInt(stringTokenizer.nextToken());
            int e = Integer.parseInt(stringTokenizer.nextToken());
            int t = Integer.parseInt(stringTokenizer.nextToken());
            arr[++idx] = new Ele(s,e,t);
            arr[++idx] = new Ele(e,s,t);
        }
        srcList = new int[w];
        for (int i = 0; i <w; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int s = Integer.parseInt(stringTokenizer.nextToken());
            int e = Integer.parseInt(stringTokenizer.nextToken());
            int t = Integer.parseInt(stringTokenizer.nextToken());
            arr[++idx] = new Ele(s,e,-t);
            srcList[i] = e;
        }
    }
    void solve(){
        for (int i = 0; i <w; i++) {
            if(!bellmanford(srcList[i])){
                stringBuilder.append("YES\n");
                return;
            }
        }
        stringBuilder.append("NO\n");
        return;

    }
    boolean bellmanford(int src){
        int dist[] = new int[n+1];
        Arrays.fill(dist,INF);
        dist[src] = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < totalEleCount; j++) {
                if(dist[arr[j].des] > dist[arr[j].src]+arr[j].dist){
                    dist[arr[j].des] = dist[arr[j].src]+arr[j].dist;
                }
            }
        }
        for (int i = 0; i < totalEleCount; i++) {
            if(dist[arr[i].des] > dist[arr[i].src]+arr[i].dist){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        new p1865().start();
    }
    class Ele{
        int src, des, dist;
        Ele(int src,int des, int dist){
            this.src = src;
            this.des = des;
            this.dist = dist;
        }
    }
}
