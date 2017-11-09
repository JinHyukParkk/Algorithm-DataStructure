import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 11. 8..
 */
public class p11052 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer stringTokenizer;
    StringBuilder stringBuilder = new StringBuilder("");

    int n;
    int dp[];
    int arr[];
    void start(){
        try{
            input();
            solve();
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine());
        dp = new int[n+1];
        arr = new int[n+1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
    }
    void solve(){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                dp[i] = Math.max(dp[i],dp[i-j]+arr[j]);
            }
        }
        stringBuilder.append(dp[n]+"\n");
    }

    public static void main(String[] args) {
        new p11052().start();
    }
}

