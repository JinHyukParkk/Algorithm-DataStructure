import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 5. 23..
 */
public class p1927 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        int n= scanner.nextInt();
        while(n--!=0){
            int x= scanner.nextInt();
            if(x ==0){
                if(queue.isEmpty()){
                    System.out.println(0);
                }else{
                    System.out.println(queue.poll());
                }
            }else{
                queue.offer(x);
            }
        }
    }
}
