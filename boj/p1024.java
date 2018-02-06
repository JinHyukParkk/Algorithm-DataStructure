import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 9. 30..
 */
public class p1024 {
    // 수열이 n개 일때 nx+n*(n-1)/2 = result 이다.
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    int n,l;
    void input() throws IOException{
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        n = Integer.parseInt(stringTokenizer.nextToken());
        l = Integer.parseInt(stringTokenizer.nextToken());
    }
    void solve(){
        int res = 0;
        for (int i =l; i <=100; i++) {
            if(check(i)){
                res = n-i*(i-1)/2;
                res/=i;
                for (int j = 0; j <i ; j++) {
                    System.out.print(res+" ");
                    res++;
                }
                return;
            }
        }
        System.out.println(-1);
    }
    boolean check(int i){
        int x = n - i*(i-1)/2;
        if(x<0) return false;
        return (x%i==0);
    }
    public static void main(String[] args) {
        p1024 test = new p1024();
        try{
            test.input();
            test.solve();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}