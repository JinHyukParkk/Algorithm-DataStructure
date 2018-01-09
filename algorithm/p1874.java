import java.util.Scanner;
import java.util.Stack;

/**
 * Created by jinhyuk on 2017. 8. 29..
 */
public class p1874 {
    Scanner scanner = new Scanner(System.in);
    Stack<Integer> stack = new Stack<Integer>();
    int n;
    StringBuilder sb = new StringBuilder();
    void input(){
        n = scanner.nextInt();
        st_f();
    }
    void st_f(){
        int max = 0;

        for (int i = 0; i <n ; i++) {
            int k = scanner.nextInt();
            if(k > max){
                for (int j = max; j < k; j++) {
                    stack.add(j+1);
                    sb.append("+\n");
                }
            }else{
                if(stack.peek() != k){
                    System.out.println("NO");
                    return;
                }
            }
            if(i==n-1){
                sb.append("-");
            }else {
                sb.append("-\n");
            }
            stack.pop();
            if(k>max) max=k;
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        p1874 test = new p1874();
        test.input();
    }
}
