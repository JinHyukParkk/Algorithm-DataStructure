import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 18..
 */
public class p2579 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int dp[];
    int n;
    int arr[];
    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine());
        arr = new int[n+1];
        dp = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
    }
    void findmax(){
        dp[0] = arr[0] = 0;
        dp[1] = arr[1];
        dp[2] = arr[1]+arr[2];
        for (int i = 3; i <= n; i++) {
            dp[i] = max(dp[i - 2], dp[i - 3] + arr[i - 1]) + arr[i];
        }
        System.out.println(dp[n]);
    }
    int max(int a, int b){
        return (a>b)?a : b;
    }

    public static void main(String[] args) {
        p2579 test = new p2579();
        try{
            test.input();
            test.findmax();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
