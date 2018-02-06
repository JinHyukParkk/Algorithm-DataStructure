import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * Created by jinhyuk on 2017. 8. 30..
 */
public class p9012  {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    Stack<Integer> stack = new Stack<Integer>();
    void input() throws Exception{
        int n = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < n ; i++) {
            String s = bufferedReader.readLine();
            stack_f(s);
        }

    }
    void stack_f(String s){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                stack.push(1);
            }else if(s.charAt(i) == ')'){
                if(stack.isEmpty()){
                    System.out.println("NO");
                    return;
                }else{
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        stack.clear();
    }
    public static void main(String[] args) {
        p9012 test = new p9012();
        try{
            test.input();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
