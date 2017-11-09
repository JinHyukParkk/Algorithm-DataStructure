import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 11. 8..
 */
public class p10942 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer stringTokenizer;
    StringBuilder stringBuilder = new StringBuilder("");

    int n;
    boolean dp[][];
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
        arr = new int[n];
        dp = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
            dp[i][i] = true;
        }
        for (int i = 0; i <n-1 ; i++) {
            if(arr[i] == arr[i+1]){
                dp[i][i+1] = true;
            }
        }


    }
    void solve(){

    }

    public static void main(String[] args) {
        new p10942().start();
    }
}

