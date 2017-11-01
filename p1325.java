import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 10. 27..
 */
public class p1325 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    StringBuilder stringBuilder = new StringBuilder("");
    int n,m;
    int count[];
    boolean visited[];
    ArrayList<Integer> arrayList[];
    Queue<Integer> q;
    ArrayList<Integer> res = new ArrayList<Integer>();
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
        count = new int[n+1];
        arrayList = new ArrayList[n+1];
        for (int i = 0; i < n+1; i++) {
            arrayList[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());
            arrayList[y].add(x);
        }
    }
    void sovle(){
        q = new LinkedList<Integer>();
        for (int i = 1; i < n+1; i++) {
            visited = new boolean[n+1];
            visited[i] = true;
            q.add(i);
            while(!q.isEmpty()){
                int cur = q.poll();
                for (int j = 0; j < arrayList[cur].size(); j++) {
                    if(!visited[arrayList[cur].get(j)]){
                        visited[arrayList[cur].get(j)] = true;
                        q.add(arrayList[cur].get(j));
                        count[i]++;
                    }
                }
            }
        }
        int max = 0;
        for (int i = 1; i < n+1; i++) {
            if(max<count[i]){
                res.clear();
                res.add(i);
                max = count[i];
            }else if(max == count[i]){
                res.add(i);
            }
        }
        for (int i = 0; i < res.size(); i++) {
            stringBuilder.append(res.get(i) + " ");
        }
        System.out.println(stringBuilder.toString());
    }

    public static void main(String[] args) {
        new p1325().start();
    }
}

