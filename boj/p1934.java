import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 9. 21..
 */
public class p1934 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    int n,m;

    void start() throws IOException{
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int tc = Integer.parseInt(stringTokenizer.nextToken());
        for (int i = 0; i < tc; i++) {
            input();
            solve();
        }
    }
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
//        int tm = n;
//        int tm1 = m;
//        int temp;
//
//        while(m!=0){
//            temp = n%m;
//            n = m;
//            m = temp;
//        }
//        System.out.println(tm*tm1/n);
        System.out.println(n * m / gcd(n, m));
    }

    public static void main(String[] args) {
        p1934 test = new p1934();
        try{
           test.start();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
