
import java.io.*;
import java.util.StringTokenizer;

public class p2163 {
    Myscanner sc = new Myscanner();
    PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    StringBuilder sb = new StringBuilder("");

    // using value
    int n,m;
    int arr[][];

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
        m = sc.nextInt();

    }
    void sovle(){
        System.out.println(n*m-1);
    }

    public static void main(String[] args) {
        new p2163().start();
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
