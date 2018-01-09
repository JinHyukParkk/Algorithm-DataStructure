import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 9. 21..
 */
public class p13241 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    long n,m;

    void input() throws IOException{
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        n = Long.parseLong(stringTokenizer.nextToken());
        m = Long.parseLong(stringTokenizer.nextToken());
    }
    long gcd(long p,long q){
        if(q==0){
            return p;
        }else{
            return gcd(q,p%q);
        }
    }
    void solve(){
        System.out.println(n * m / gcd(n, m));
    }

    public static void main(String[] args) {
        p13241 test = new p13241();
        try{
            test.input();
            test.solve();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
