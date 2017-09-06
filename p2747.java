import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 3..
 */
public class p2747 {
    int arr[];
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    void input() throws IOException{
        int n = Integer.parseInt(bufferedReader.readLine());
        arr = new int[n+1];
        System.out.println(fibo(n));

    }
    int fibo(int n) {
        if (n <= 1) {
            return n;
        }else if(arr[n] != 0){
            return arr[n];
        }
        else{
            return arr[n]= fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String[] args) {
        p2747 test = new p2747();
        try{
            test.input();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
