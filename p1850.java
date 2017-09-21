import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 9. 21..
 */
public class p1850 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    StringBuilder stringBuilder = new StringBuilder("");
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
        Long g = gcd(n,m);
        for (int i = 0; i <g ; i++) {
            stringBuilder.append("1");
        }
        System.out.println(stringBuilder.toString());
    }

    public static void main(String[] args) {
        p1850 test = new p1850();
        try{
            test.input();
            test.solve();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
