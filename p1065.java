import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 22..
 */
public class p1065 {
    // 자리수가 등차수열을 이루는 한수 문제
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n,h,t,o;
    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine());
    }
    void solve(){
        int count = 0;
        for (int i = 1; i <=n ; i++) {
            if(check(i)) count++;
        }
        System.out.println(count);
    }
    boolean check(int a){
        if(a<100){
            return true;
        }else{
            h = a/100;
            a%=100;
            t = a/10;
            o = a%10;
            if(h-t == t-o){ return true;}
            else{ return false;}
        }
    }
    public static void main(String[] args) {
        p1065 test = new p1065();
        try{
            test.input();
            test.solve();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
