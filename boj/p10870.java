import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 3..
 */
public class p10870 {
    int arr[];
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    void input() throws IOException{
        int n = Integer.parseInt(bufferedReader.readLine());
        System.out.println(fibo(n));

    }
    int fibo(int n) {
        if (n <= 1) {
            return n;
        }else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String[] args) {
        p10870 test = new p10870();
        try{
            test.input();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
