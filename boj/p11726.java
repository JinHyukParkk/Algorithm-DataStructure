import java.io.*;

/**
 * Created by jinhyuk on 2017. 11. 8..
 */
public class p11726 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder stringBuilder = new StringBuilder("");

    int n;
    int dp[];
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
    }
    void solve(){
        dp[0] = dp[1] = 1;
        for (int i = 2; i <=n ; i++) {
            dp[i] = (dp[i-1]+dp[i-2])%10007;
        }
        stringBuilder.append(dp[n]+"\n");
    }

    public static void main(String[] args) {
        new p11726().start();
    }
}
