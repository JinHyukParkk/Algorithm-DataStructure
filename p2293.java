import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 19..
 */
public class p2293 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n,k;
    int arr[];
    int dp[];
    void input() throws IOException{
        String str[] = bufferedReader.readLine().split("\\s");
        n = Integer.parseInt(str[0]);
        k = Integer.parseInt(str[1]);
        dp = new int[k+1];
        arr = new int[n+1];
        for (int i = 0; i <n ; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
    }
    void findcase(){
        dp[0] =1;
        for (int i = 0; i <n ; i++) {
            for (int j = arr[i]; j <= k; j++) {
                dp[j] += dp[j-arr[i]];
            }
        }
        System.out.println(dp[k]);

    }
    public static void main(String[] args) {
        p2293 test = new p2293();
        try{
            test.input();
            test.findcase();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
