import java.io.*;
import java.util.StringTokenizer;

public class p15552 {
    Myscanner sc = new Myscanner();
    PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    StringBuilder sb = new StringBuilder("");

    // using value
    int tc;
    int a;
    int b;

    void start(){
        try{
            input();
//            sovle();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    void input() throws IOException {
        tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            sovle();
        }

    }
    void sovle() {
        System.out.println(a+b);
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
        new p15552().start();
    }
}
