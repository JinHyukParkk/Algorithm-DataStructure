import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 10. 2..
 */
public class p11725 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    ArrayList<Integer> arrayList[];
    Queue<Integer> queue = new LinkedList<Integer>();
    boolean check[];
    int depth[];
    int parent[];
    int n, root;
    void start(){
        try{
            input();
            solve();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine());
        arrayList = new ArrayList[n+1];
        check = new boolean[n+1];
        depth = new int[n+1];
        parent = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            arrayList[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < n-1; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());
            arrayList[x].add(y);
            arrayList[y].add(x);

        }
    }
    void solve(){
        depth[1] = 0;
        check[1] = true;
        parent[1] = 0;
        queue.offer(1);
        while(!queue.isEmpty()){
            int x = queue.poll();
            for(int a : arrayList[x]) {
                if(!check[a]){
                    depth[a] = depth[a]+1;
                    check[a] = true;
                    parent[a] = x;
                    queue.offer(a);
                }
            }
        }
        for (int i = 2; i <=n ; i++) {
            System.out.println(parent[i]);
        }
    }
    public static void main(String[] args) {
        new p11725().start();
    }
}
