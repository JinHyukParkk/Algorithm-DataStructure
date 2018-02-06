import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by jinhyuk on 2017. 9. 1..
 */
public class p1966 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int[] arr;
    Queue<Integer> q = new LinkedList<Integer>();
    void input() throws Exception{
        int tc = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i <tc ; i++) {
            String s[] = bufferedReader.readLine().split(" ");
            while(!q.isEmpty()) q.poll();

            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            arr = new int[n];
            String s1[] = bufferedReader.readLine().split(" ");
            for (int j = 0; j < s1.length; j++) {
                arr[j] = Integer.parseInt(s1[j]);
                q.offer(arr[j]);
            }
            Arrays.sort(arr);
            int cnt = 1;
            while(true){
                if(q.peek()!=arr[arr.length-cnt]){
                    q.offer(q.peek());
                    q.poll();
                }else{
                    if(m==0) break;
                    n--;
                    cnt++;
                    q.poll();
                }
                m = (m-1+n)%n;
            }
            System.out.println(cnt);

        }
    }
    public static void main(String[] args) {
        p1966 test = new p1966();
        try{
            test.input();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
