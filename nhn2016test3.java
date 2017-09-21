import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 20..
 */
public class nhn2016test3 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n;
    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine());
    }
    void solve(){
        for (int i = 0; i <3; i++) {
            if(comp(n+reverse(n))){
                System.out.println(n+reverse(n));
                return;
            }else{
                n = n+reverse(n);
            }
        }
        System.out.println(-1);
    }
    boolean comp(int a){
        String s = String.valueOf(a);
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(s.length()-1-i) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    int reverse(int a){
        int res = 0;
        while(a != 0){
            res = res*10 + a%10;
            a /=10;
        }
        return res;

    }

    public static void main(String[] args) {
        nhn2016test3 test = new nhn2016test3();
        try{
            test.input();
            test.solve();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
