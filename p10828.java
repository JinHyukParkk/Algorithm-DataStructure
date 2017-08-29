import java.util.Scanner;
import java.util.Stack;

/**
 * Created by jinhyuk on 2017. 8. 28..
 */
public class p10828 {
    Scanner scanner = new Scanner(System.in);
    Stack<String> stack;
    void input(){
        stack = new Stack<String>();
        int sc = scanner.nextInt();
        scanner.nextLine();
        comm(sc);
    }
    void comm(int sc){
        for (int i = 0; i < sc ; i++) {
            String com = scanner.nextLine();
            String comSpt[] = com.split(" ");
            switch (comSpt[0]){
                case "push":
                    stack.push(comSpt[1]);
                    break;
                case "pop":
                    System.out.println(stack.isEmpty() ? -1 : stack.pop());
                    break;
                case "top":
                    System.out.println(stack.isEmpty()? -1 : stack.peek());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    System.out.println(stack.isEmpty()? 1 : 0);
                    break;
            }
        }
        stack.clear();
        scanner.close();
    }

    public static void main(String[] args) {
        p10828 test = new p10828();
        test.input();
    }
}
