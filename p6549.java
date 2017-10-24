import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 10. 22..
 */
public class p6549 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    int n;
    int arr[];
    Stack<Integer> stack;
    void start(){
        try{
            while(true){
                stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                n = Integer.parseInt(stringTokenizer.nextToken());
                if(n==0){
                    break;
                }
                input();
                sovle();
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    void input() throws IOException{
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        stack = new Stack<Integer>();

    }
    void sovle(){
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int left = i;
            while(!stack.empty() && arr[stack.peek()] > arr[i]){
                int height = arr[stack.peek()];
                stack.pop();
                int width = i;
                if(!stack.empty()) width = (i- stack.peek() - 1);
                if(ans < width*height) ans = width*height;
            }
            stack.push(i);
        }
        while(!stack.empty()){
            int height = arr[stack.peek()];
            stack.pop();
            int width = n;
            if(!stack.empty()) width = n - stack.peek()-1;
            if(ans < height*width) ans = height*width;
        }
        System.out.println(ans);

    }

    public static void main(String[] args) {
        new p6549().start();
    }
}
