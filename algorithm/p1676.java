import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 6..
 */
public class p1676 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    void input() throws IOException{
        int n = Integer.parseInt(bufferedReader.readLine());

        int five=0;
        int two=0;
        for (int i = 2; i <= n ; i*=2) {
            two += n/i;
        }
        for (int i = 5; i <= n ; i*=5) {
            five += n/i;
        }
        System.out.println(five<two?five:two);

    }
    public static void main(String[] args) {
        p1676 test = new p1676();
        try{
            test.input();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
