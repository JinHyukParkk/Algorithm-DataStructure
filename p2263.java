import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 10. 23..
 */
public class p2263 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    StringBuilder stringBuilder = new StringBuilder("");
    int n;
    int arr[][];
    int in[];
    int post[];

    void start(){
        try{
            input();
            sovle();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine());
        in = new int[n+1];
        post = new int[n+1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            in[Integer.parseInt(stringTokenizer.nextToken())] =i;
        }
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            post[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
    }
    void sovle(){
        pre(0,n-1,0,n-1);
        System.out.println(stringBuilder.toString());
    }
    void pre(int s,int e,int s1, int e1) {
        if (s > e || s1 > e1) return;

        int root = post[e1];
        stringBuilder.append(post[e1] + " ");
        pre(s,in[root]-1, s1,s1+in[root]-s-1);
        pre(in[root]+1,e,s1+in[root]-s,e1-1);
    }

    public static void main(String[] args) {
        new p2263().start();
    }
}

