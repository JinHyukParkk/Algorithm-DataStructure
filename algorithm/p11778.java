import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 11. 1..
 */
public class p11778 {
    Myscanner sc = new Myscanner();
    PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    StringBuilder sb = new StringBuilder("");
    long a,b;
    long fibo[];
    void start(){
        try{
            input();
            sovle();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    void input() throws IOException {
        a = sc.nextLong();
        b = sc.nextLong();
    }
    void sovle(){
        long max = (a>b?a : b);
        fibo = new long[(int)max+1];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i <=max; i++) {
            fibo[i] = fibo[i-1]+fibo[i-2];
            fibo[i]%=1000000007;
        }
        System.out.println(gcd(fibo[(int)a],fibo[(int)b]));
    }
    long gcd(long p,long q){
        if(p%q==0) return q;
        else return gcd(q,p%q);
    }

    public static void main(String[] args) {
        new p11778().start();
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


