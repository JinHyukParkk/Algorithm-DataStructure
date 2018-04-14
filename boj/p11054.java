
import java.io.*;
import java.util.*;

public class p11054 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder("");

    // using value
    int n;
    int arr[];
    int dp[][];


    void start(){
        try{
            input();
            sovle();
            print();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        arr = new int[n+1];
        dp = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    void sovle() {
        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
            for (int j = 0; j < i; j++) {
                if(arr[i] > arr[j] && dp[i][0] < dp[j][0] + 1){
                    dp[i][0] = dp[j][0] + 1;
                }
            }
        }
        for (int i = n-1; i >= 0; i--) {
            dp[i][1] = 1;
            for (int j = i+1; j < n; j++) {
                if(arr[i] > arr[j] && dp[i][1] < dp[j][1] + 1){
                    dp[i][1] = dp[j][1] + 1;
                }
            }
        }
        int max = dp[0][0]+dp[0][1]-1;
//        System.out.println(dp[0][0]+" "+ dp[0][1]);
        for (int i = 1; i < n; i++) {
//            System.out.println(dp[i][0]+" "+ dp[i][1]);
            max = Math.max(max,dp[i][0]+dp[i][1]-1);
        }
        sb.append(max);

    }
    void print(){
        out.write(sb.toString());
        out.close();
    }
    public static void main(String[] args) {
        new p11054().start();
    }
}
