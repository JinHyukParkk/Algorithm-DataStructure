import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 19..
 */
public class p2156 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n;
    int arr[];
    int dp[];
    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine());
        arr = new int[n+1];
        dp = new int[n+1];
        for (int i = 1; i <=n ; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
    }

    void findmax(){
        if(n ==1){
            System.out.println(arr[1]);
            return;
        }
        dp[1] = arr[1];
        dp[2] = dp[1]+arr[2];
        for (int i = 3; i <=n ; i++) {
            dp[i] = Math.max(arr[i-1]+dp[i-3],dp[i-2])+arr[i];
            dp[i] = Math.max(dp[i-1],dp[i]);
        }
        System.out.println(dp[n]);
    }

    public static void main(String[] args) {
        p2156 test = new p2156();
        try{
            test.input();
            test.findmax();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
