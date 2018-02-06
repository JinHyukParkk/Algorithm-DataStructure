import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 10. 26..
 */
public class p2606 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    ArrayList<Integer> arrayList[];
    Queue<Integer> q = new LinkedList<Integer>();
    int n;
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
        arrayList = new ArrayList[n+1];
        for (int i = 0; i < n+1; i++) {
            arrayList[i] = new ArrayList<Integer>();
        }
        int m = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < m; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());
            arrayList[x].add(y);
            arrayList[y].add(x);
        }

    }
    void sovle(){
        q.add(1);
        int count=0;
        boolean visited[] = new boolean[n+1];
        visited[1] = true;
        while(!q.isEmpty()){
            int next = q.poll();
            for(int a : arrayList[next]){
                if(visited[a]) continue;
                q.add(a);
                count++;
                visited[a] = true;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        new p2606().start();
    }
}
