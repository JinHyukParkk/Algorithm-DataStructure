import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 9. 22..
 */
public class p1915 {
    // 정사각형 찾기 DP 문제.
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    int arr[][];
    int dp[][];
    int n,m;
    void input() throws IOException{
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        n = Integer.parseInt(stringTokenizer.nextToken());
        m = Integer.parseInt(stringTokenizer.nextToken());
        arr = new int[n+1][m+1];
        dp = new int[n+1][m+1];
        for (int i = 1; i <=n ; i++) {
            String temp = bufferedReader.readLine();
            for (int j = 1; j <=m ; j++) {
                arr[i][j] = temp.charAt(j-1) - '0';
            }
        }
    }
    void solve(){
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m ; j++) {
                if(arr[i][j] == 1){
                    dp[i][j] = Math.min(dp[i - 1][i - 1], Math.min(dp[i - 1][j], dp[i][j - 1]))+1;
                    max = Math.max(max,dp[i][j]);
                }
            }
        }
        System.out.println(max*max);
    }
    public static void main(String[] args) {
        p1915 test = new p1915();
        try{
            test.input();
            test.solve();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
