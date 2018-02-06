import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 11. 2..
 */
public class p12796 {
    Myscanner sc = new Myscanner();
    PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    StringBuilder sb = new StringBuilder("");

    int n;
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
    }
    void sovle(){
        sb.append(3+"\n"+1+" "+1+" "+1+" "+(n+1));
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        new p12796().start();
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

