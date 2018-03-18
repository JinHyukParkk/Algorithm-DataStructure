import java.io.*;
import java.util.StringTokenizer;

public class p9465 {
    Myscanner sc = new Myscanner();
    PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    StringBuilder sb = new StringBuilder("");

    // using value
    int tc;
    int n;
    int dp[][];
    int arr[][];
    void start(){
        try{
            tc = sc.nextInt();
            for (int i = 0; i < tc; i++) {
                input();
                sovle();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    void input() throws IOException {
        n = sc.nextInt();
        dp = new int[n+1][3];
        arr = new int[2][n];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
    }
    void sovle() {
        dp[0][0] = 0;
        dp[0][1] = arr[0][0];
        dp[0][2] = arr[1][0];
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(Math.max(dp[i-1][0],dp[i-1][1]),dp[i-1][2]);
            dp[i][1] = Math.max(dp[i-1][0],dp[i-1][2]) + arr[0][i];
            dp[i][2] = Math.max(dp[i-1][0],dp[i-1][1]) + arr[1][i];
        }
        System.out.println(Math.max(Math.max(dp[n-1][0],dp[n-1][1]),dp[n-1][2]));

    }
    class Myscanner {
        BufferedReader br;
        StringTokenizer st;

        Myscanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
    public static void main(String[] args) {
        new p9465().start();
    }
}
