import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 19..
 */
public class p10844 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n;
    int dp[][];
    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine());
        dp = new int[n+1][10];
    }

    void findcount() {
        long sum = 0;
        for (int i = 1; i < 10; i++) {
            dp[1][i] = 1;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < 10; j++) {
                if (j + 1 < 10 && -1 < j - 1) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j + 1];
                } else if (j + 1 < 10) {
                    dp[i][j] = dp[i - 1][j + 1];
                } else {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                dp[i][j] %= 1000000000;
            }
        }
        for (int i = 0; i < 10; i++) {
            sum += dp[n][i];
            sum %= 1000000000;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        p10844 test = new p10844();
        try{
            test.input();
            test.findcount();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
