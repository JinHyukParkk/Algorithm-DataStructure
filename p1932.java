import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 10..
 */
public class p1932 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n;
    int arr[][];
    int dp[][];
    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine());
        arr = new int[n+1][n+1];
        dp = new int[n+1][n+1];
        for (int i = 1; i <=n ; i++) {
            String str[] = bufferedReader.readLine().split(" ");
            for (int j = 1; j <= i; j++) {
                arr[i][0] = 0;
                arr[i][j] = Integer.parseInt(str[j-1]);
            }
        }
        dp[1][1] = arr[1][1];
    }
    int max(int a, int b){ return (a<b ? b : a);}
    int findMax(){
        int total = 0;
        for (int i = 2; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
//                dp[i][j] = Math.max(dp[i-1][j-1],dp[i-1][j])+arr[i][j];
//                total = Math.max(dp[i][j],total);
                dp[i][j] = max(dp[i - 1][j - 1], dp[i - 1][j])+arr[i][j];
                total = max(dp[i][j],total);
            }

        }
        return total;
    }

    public static void main(String[] args) {
        p1932 test = new p1932();
        try{
            test.input();
            System.out.println(test.findMax());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
