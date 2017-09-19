import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 19..
 */
public class p1912 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n;
    int arr[];
    int dp[];
    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine());
        arr = new int[n];
        dp = new int[n];
        String str[] = bufferedReader.readLine().split("\\s");
        for (int i = 0; i <n ; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
    }
    void solve(){
        dp[0] = arr[0];
        int max =arr[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(0,dp[i-1])+arr[i];
            max = max<dp[i]?dp[i]:max;
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        p1912 test = new p1912();
        try{
            test.input();
            test.solve();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
