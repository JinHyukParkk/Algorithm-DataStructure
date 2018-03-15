import java.io.*;
import java.util.StringTokenizer;

public class p11727 {
    Myscanner sc = new Myscanner();
    PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    StringBuilder sb = new StringBuilder("");

    // using value
    int n;
    int dp[];

    void start(){
        try{
            input();
            sovle();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    void input() throws IOException {
        n = sc.nextInt();
        dp = new int[n+1];
    }
    void sovle() {
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <=n; i++) {
            dp[i] = 2*dp[i-2]+dp[i-1];
            dp[i] %= 10007;
        }
        System.out.println(dp[n]);
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
        new p11727().start();
    }
}
