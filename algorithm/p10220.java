import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 11. 1..
 */
public class p10220 {
    Myscanner sc = new Myscanner();
    PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    StringBuilder sb = new StringBuilder("");
    int n;
    void start(){
        try{
            int tc = sc.nextInt();
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
    }
    void sovle(){
        if(n == 1 || n == 2 || n == 3 || n == 6){
            System.out.println("0");
        }else if(n == 4){
            System.out.println("2");
        }else{
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        new p10220().start();
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
