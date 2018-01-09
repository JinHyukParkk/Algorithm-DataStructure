import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 9. 16..
 */
public class p1697 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    Queue<Integer> queue = new LinkedList<Integer>();
    int max_value = 1000000;
    boolean check[];
    int dis[];
    int m,n;

    void input() throws IOException{
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
//        String string[] = bufferedReader.readLine().split("\\s+");
        m = Integer.parseInt(stringTokenizer.nextToken());
        n = Integer.parseInt(stringTokenizer.nextToken());
        check = new boolean[max_value];
        dis = new int[max_value];
    }
    int findmin(){
        queue.offer(m);
        while(!queue.isEmpty()){
            int temp = queue.poll();
            if(temp == n) break;
            if(temp-1>=0 && check[temp-1]==false){
                queue.offer(temp-1);
                check[temp-1] = true;
                dis[temp-1] = dis[temp]+1;
            }
            if(temp+1<max_value && check[temp+1]==false){
                queue.offer(temp+1);
                check[temp+1] = true;
                dis[temp+1] = dis[temp]+1;
            }
            if(temp*2<max_value && check[2*temp]==false){
                queue.offer(temp*2);
                check[temp*2] = true;
                dis[temp*2] = dis[temp]+1;
            }
        }
        return dis[n];
    }
    public static void main(String[] args) {
        p1697 test = new p1697();
        try{
            test.input();
            System.out.println(test.findmin());
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
