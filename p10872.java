import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 6..
 */
public class p10872 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    void input() throws IOException{
        int n = Integer.parseInt(bufferedReader.readLine());
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        p10872 test = new p10872();
        try{
            test.input();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
