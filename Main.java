import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by jinhyuk on 2017. 9. 19..
 */
public class Main {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int tc;
    int n;
    int arr[];
    int dp[][];
    int sum[];
    void start() throws IOException{
        tc = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < tc; i++) {
            input();
            System.out.println(solve(0, n - 1));
        }
    }
    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine());
        arr = new int[n];
        dp = new int[n][n];
        sum = new int[n];
        String[] a = bufferedReader.readLine().split("\\s");
        int s= 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(a[i]);
            s+=arr[i];
            sum[i] = s;
        }
        for (int[] ar : dp) {
            Arrays.fill(ar,-1);
        }
    }
    int solve(int a, int b){
        if(a>=b) return 0;
        if(dp[a][b]>-1) return dp[a][b];
        int s = a==0? sum[b]:sum[b]-sum[a-1];
        for (int i = a; i <=b ; i++) {
            dp[a][b] = dp[a][b] == -1 ? Integer.MAX_VALUE:dp[a][b];
            dp[a][b] = Math.min(dp[a][b],solve(a,i)+solve(i+1,b)+s);
        }
        return dp[a][b];
    }

    public static void main(String[] args) {
        Main test = new Main();
        try{
            test.start();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

