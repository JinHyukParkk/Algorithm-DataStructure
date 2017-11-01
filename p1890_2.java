import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 10. 27..
 */
public class p1890_2 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    int n;
    int arr[][];
    long dp[][];
    void start(){
        try{
            input();
            sovle();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine());
        arr = new int[n][n];
        dp = new long[n][n];
        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
    }
    void sovle(){
        dp[0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int p = arr[i][j];
                if(dp[i][j] == 0 || p == 0) continue;
                if(i+p<n) dp[i+p][j] += dp[i][j];
                if(j+p<n) dp[i][j+p] += dp[i][j];
            }   
        }
        System.out.println(dp[n-1][n-1]);
    }

    public static void main(String[] args) {
        new p1890_2().start();
    }
}
