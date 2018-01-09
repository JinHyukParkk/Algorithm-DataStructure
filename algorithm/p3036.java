import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 9. 21..
 */
public class p3036 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    int n;
    int arr[];
    void input() throws IOException{
        n = Integer.parseInt(new StringTokenizer(bufferedReader.readLine()).nextToken());
        arr = new int[n];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
    }
    int gcd(int p,int q){
        if(q==0) return p;
        else return gcd(q,p%q);
    }
    void solve(){
        int g;
        for (int i = 1; i < n; i++) {
            g = gcd(arr[0],arr[i]);
            System.out.println(arr[0]/g+"/"+arr[i]/g);
        }
    }
    public static void main(String[] args) {
        p3036 test = new p3036();
        try{
            test.input();
            test.solve();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
