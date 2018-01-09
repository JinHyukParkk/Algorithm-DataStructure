import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 10. 27..
 */
public class p1016 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    long m,n;
    boolean arr[];
    void start(){
        try{
            input();
            sovle();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    void input() throws IOException{
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        m = Long.parseLong(stringTokenizer.nextToken());
        n = Long.parseLong(stringTokenizer.nextToken());
    }
    void sovle(){
        int size = (int)(n-m+1);
        arr = new boolean[size];
        int count=0;
        long end = (long) Math.sqrt(n);
        for (int i = 2; i<=end ; i++) {
            long p = i*i;
            long c= ((m-1)/p+1)*p;
            while(c<=n){
                if(!arr[(int)(c-m)]){
                    count++;
                    arr[(int)(c-m)] = true;
                }
                c+=p;
            }
        }
        System.out.println(size-count);
    }

    public static void main(String[] args) {
        new p1016().start();
    }
}

