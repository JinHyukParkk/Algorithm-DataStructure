import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 19..
 */
public class p1463 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n;
    int dp[];
    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine());
        dp = new int[n+1];
    }
    void findmin(){
        dp[1] = 0;
        for (int i = 2; i <=n; i++) {
            dp[i] = dp[i-1]+1;
            if(i%2==0 && dp[i] > dp[i/2]+1){
                dp[i] = dp[i/2]+1;
            }
            if(i%3==0 && dp[i] > dp[i/3]+1){
                dp[i] = dp[i/3]+1;
            }
        }
        System.out.println(dp[n]);
    }
    public static void main(String[] args) {
        p1463 test = new p1463();
        try{
            test.input();
            test.findmin();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
