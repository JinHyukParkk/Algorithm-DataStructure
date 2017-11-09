import java.io.*;
import java.util.*;

/**
 * Created by jinhyuk on 2017. 11. 2..
 */
public class p11689 {
    Myscanner sc = new Myscanner();
    PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    StringBuilder sb = new StringBuilder("");

    long n;
    ArrayList<Long> arrayList = new ArrayList<Long>();
    void start(){
        try{
            input();
            sovle();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    void input() throws IOException {
        n = sc.nextLong();
    }
    void sovle(){
        long a = n;
        for (long i = 2; i*i <= a; i++) {
            if(a%i!=0) continue;
            else{
                while(a%i==0){
                    a/=i;
                }
                arrayList.add(i);
            }
        }
        if(a != 1) arrayList.add(a);
        Collections.sort(arrayList);
        Queue<Long> q = new LinkedList<>();
        Queue<Integer> p = new LinkedList<>();
        Queue<Boolean> c = new LinkedList<>();

        for (int i = 0; i < arrayList.size(); i++) {
            q.offer(arrayList.get(i));
            p.offer(i);
            c.offer(true);
        }
        long ans = n;
        while(!q.isEmpty()){
            long m = q.poll();
            boolean flg = c.poll();
            int s = p.poll();

            if(flg){
                ans -= n/m;
            }else{
                ans += n/m;
            }
            for (int i = s+1; i < arrayList.size(); i++) {
                long nm = m*arrayList.get(i);
                if(nm<=n){
                    q.offer(nm);
                    c.offer(!flg);
                    p.offer(i);
                }else{
                    break;
                }
            }

        }
        if(ans == 0){
            System.out.println(1);
        }else{
            System.out.println(ans);
        }


    }

    public static void main(String[] args) {
        new p11689().start();
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

