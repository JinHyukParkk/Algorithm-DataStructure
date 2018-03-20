import java.io.*;
import java.util.StringTokenizer;


public class p11055 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    StringBuilder sb = new StringBuilder("");

    // using value
    int n;
    int dp[];
    int arr[];
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
        dp = new int[n];
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

    }
    void sovle() {
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if(arr[j]<arr[i] && dp[i] < dp[j] + 1){
                    dp[i] = dp[j] + 1;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if(dp[i] > max){
                max = dp[i];
            }
        }
        sb.append(max);
        sb.append("\n");

    }
    void print(){
        System.out.println(sb);
    }
    public static void main(String[] args) {
        new p11055().start();
    }
}
