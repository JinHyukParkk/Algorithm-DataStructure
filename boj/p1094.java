import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 9. 21..
 */
public class p1094 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int x;
    void input() throws IOException{
        x = Integer.parseInt(new StringTokenizer(bufferedReader.readLine()).nextToken());
    }
    void solve(){
        int n = 64;
        int count = 0;
        while(x!=0){
            if(n<=x){
                x = x-n;
                count++;
            }
            n/=2;
        }
        System.out.println(count);

    }
    public static void main(String[] args) {
        p1094 test = new p1094();
        try{
            test.input();
            test.solve();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
