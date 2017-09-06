import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 6..
 */
public class p11401 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    void input() throws IOException{
        String s[] = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int r = Integer.parseInt(s[1]);
        long p = 1000000007;
        long t1 = 1;
        long t2 = 1;

        for (long i = 1; i <=n ; i++) {
            t1*=i;
            t1%=p;
        }
        for (long i = 1; i <=r ; i++) {
            t2*=i;
            t2%=p;
        }
        for (long i = 1; i <=n-r ; i++) {
            t2*=i;
            t2%=p;
        }
        long t3 = mul(t2,p-2,p);
        t3 %= p;
        long ans = t1*t3;
        ans %= p;
        System.out.println(ans);


    }
    long mul(long x, long y, long p){
        long ans = 1;
        while(y>0){
            if(y%2 != 0){
                ans *=x;
                ans %=p;
            }
            x *=x;
            x %=p;
            y/=2;
        }
        return ans;
    }
    public static void main(String[] args) {
        p11401 test = new p11401();
        try{
            test.input();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
