import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by jinhyuk on 2017. 9. 16..
 */
public class test2 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    Queue<String> queue = new LinkedList<>();
    String s[];
    int time;
    int n;
    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine());
        s = bufferedReader.readLine().split(" ");
    }
    void timefind(){
        for (int i = 0; i < s.length; i++) {
            s[i] = s[i].toLowerCase();
            if(queue.contains(s[i])){
                queue.remove(s[i]);
                queue.offer(s[i]);
                time+=1;
            }else{
                if(queue.size() == n){
                    queue.poll();
                }
                queue.offer(s[i]);
                time+=5;
            }
        }
        System.out.println(time);
    }

    public static void main(String[] args) {
        test2 test2 = new test2();
        try{
            test2.input();
            test2.timefind();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
