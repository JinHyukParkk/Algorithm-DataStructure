import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 20..
 */
public class p3053 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n;
    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine());
        System.out.format("%.6f\n", n * n * Math.PI);
        System.out.format("%.6f\n",(double)n*n*2);
    }
    public static void main(String[] args) {
        p3053 test = new p3053();
        try{
            test.input();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
