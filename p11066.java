import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by jinhyuk on 2017. 9. 19..
 */
public class p11066 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int tc;
    int n;
    int arr[];
    int sum[];
    int dp[][];
    void start() throws IOException{
        tc = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < tc; i++) {
            input();
            System.out.println(solve(0, n - 1));
        }
    }
    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine());
        arr = new int[n+1];
        dp = new int[n+1][n+1];
        sum = new int[n+1];
        String string[] = bufferedReader.readLine().split("\\s");
        int s= 0;
        for (int i = 0; i <n; i++) {
            arr[i] = Integer.parseInt(string[i]);
            s+=arr[i];
            sum[i]= s;
        }
        for (int[] a:dp) {
            Arrays.fill(a,-1);
        }

        for (int i = 1; i <n ; i++) {
            dp[i][i]=0;
            dp[i-1][i] = arr[i-1]+arr[i];
        }
    }
    int solve(int a, int b){
        if(a >= b) return 0;
        if(dp[a][b]>-1) return dp[a][b];
        int s = a==0?sum[b]:sum[b]-sum[a-1];
        for (int i = a; i <=b ; i++) {
            int temp = solve(a,i)+solve(i+1,b)+s;
            dp[a][b] = (dp[a][b]==-1 || dp[a][b]>temp)?temp:dp[a][b];
        }
        return dp[a][b];

    }

    public static void main(String[] args) {
        p11066 test = new p11066();
        try{
            test.start();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
