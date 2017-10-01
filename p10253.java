import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 9. 30..
 */
public class p10253 {
    // 계속 뺄 수 있는 단위 분수 찾는 것이 중요. 반복문을 돌리기 보다 (y%x==0)?y/x:y/x+1 라는 공식 발견
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    int tc;
    int a,b;
    void start() throws IOException{
        tc = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < tc; i++) {
            input();
            solve();
        }
    }
    void input() throws IOException{
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        a = Integer.parseInt(stringTokenizer.nextToken());
        b = Integer.parseInt(stringTokenizer.nextToken());
    }
    void solve(){
        int x = a;
        int y = b;
        int v;
        while(x!=1){
            v = (y%x==0)?y/x:y/x+1;
            x = x*v-y;
            y *=v;
            // 최대공약수로 안나눠주면 시간초과 뜬다 ~
            int g = gcd(x,y);
            x /=g; y/=g;
        }
        System.out.println(y);
    }
    int gcd(int a, int b){ return b==0?a : gcd(b,a%b);}
    public static void main(String[] args) {
        p10253 test = new p10253();
        try{
            test.start();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
