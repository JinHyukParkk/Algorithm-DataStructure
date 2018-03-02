
import java.io.*;
import java.util.StringTokenizer;

public class p2167 {
    Myscanner sc = new Myscanner();
    PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    StringBuilder sb = new StringBuilder("");

    // using value
    int n,m,k;
    int arr[][];
    int s_x,s_y,e_x,e_y;
    int prefix[][];

    void start(){
        try{
            input();
//            sovle();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    void input() throws IOException {
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n+1][m+1];
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        prefix = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                prefix[i][j] = prefix[i][j - 1] + arr[i][j];
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                prefix[i][j] += prefix[i - 1][j];
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.printf(prefix[i][j]+" ");
            }
            System.out.println();
        }
        k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            s_x = sc.nextInt();
            s_y = sc.nextInt();
            e_x = sc.nextInt();
            e_y = sc.nextInt();
            sovle();
        }

    }
    void sovle(){
        System.out.println(prefix[e_x][e_y] - prefix[s_x - 1][e_y] - prefix[e_x][s_y - 1] + prefix[s_x - 1][s_y - 1]);
    }

    public static void main(String[] args) {
        new p2167().start();
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
}
