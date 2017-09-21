import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 9. 21..
 */
public class p2609 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    int n,m;

    void input() throws IOException{
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        n = Integer.parseInt(stringTokenizer.nextToken());
        m = Integer.parseInt(stringTokenizer.nextToken());
    }
    int gcd(int p,int q){
        if(q==0){
            return p;
        }else{
            return gcd(q,p%q);
        }
    }
    void solve(){
        int g = gcd(n,m);
        System.out.println(g);
        System.out.println(n * m / g);
    }

    public static void main(String[] args) {
        p2609 test = new p2609();
        try{
            test.input();
            test.solve();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
