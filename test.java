import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Test {

    static Myscanner sc = new Myscanner();
    static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) throws IOException {

        int TC = sc.nextInt();
        ArrayList<Time> al = new ArrayList<Time>();

        while (TC-- > 0) {
            int S = sc.nextInt();
            int E = sc.nextInt();
            al.add(new Time(S, E));
        }
        Collections.sort(al);

        int count = 0;
        int start = -1;
        for (int j = 0; j < al.size(); j++) {
            if (al.get(j).S >= start) {
                start = al.get(j).E;
                count++;
            }
        }

        out.println(count);
        out.flush();
    }
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
class Time implements Comparable<Time> {
    int S, E;

    Time(int S, int E) {
        this.S = S;
        this.E = E;
    }

    @Override
    public int compareTo(Time o) {
        return this.S <= o.S ? -1 : 1;
    }

}


