import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 19..
 */
public class p2965 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int a,b,c;
    void input() throws IOException{
        String s[] = bufferedReader.readLine().split("\\s");
        a = Integer.parseInt(s[0]);
        b = Integer.parseInt(s[1]);
        c = Integer.parseInt(s[2]);
        System.out.println(b-a>c-b?b-a-1:c-b-1);
    }

    public static void main(String[] args) {
        p2965 test = new p2965();
        try{
            test.input();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
