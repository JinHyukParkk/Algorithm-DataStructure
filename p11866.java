import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by jinhyuk on 2017. 9. 1..
 */
public class p11866 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    Queue<Integer> queue = new LinkedList<Integer>();
    int n,m;
    void input() throws Exception{
        String[] string = bufferedReader.readLine().split(" ");
        n = Integer.parseInt(string[0]);
        m = Integer.parseInt(string[1]);
        for (int i = 1; i <=n ; i++) {
            queue.offer(i);
        }
        jose();
    }
    void jose(){
        System.out.print("<");
        for (int i = 0; i <n-1 ; i++) {
            for (int j = 0; j < m-1 ; j++) {
                queue.offer(queue.poll());
            }
            System.out.print(queue.poll()+", ");
        }
        System.out.print(queue.poll()+">");

    }
    public static void main(String[] args) {
        p11866 test = new p11866();
        try{
            test.input();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
