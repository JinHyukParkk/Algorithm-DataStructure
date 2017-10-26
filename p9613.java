import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 10. 25..
 */
public class p9613 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    int n;
    int arr[];
    void start(){
        try{
            int tc = Integer.parseInt(bufferedReader.readLine());
            for (int i = 0; i < tc; i++) {
                input();
                sovle();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    void input() throws IOException{
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        n = Integer.parseInt(stringTokenizer.nextToken());
        arr = new int[n+1];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
    }
    void sovle(){
        long sum = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j <n ; j++) {
                sum+=gcd(arr[i],arr[j]);
            }
        }
        System.out.println(sum);
    }
    int gcd(int a, int b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }

    public static void main(String[] args) {
        new p9613().start();
    }
}

