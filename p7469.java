import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 10. 1..
 */
public class p7469 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    int n,m;
    int arr[];
    int a,b,k;
    int res[];

    void input() throws IOException{
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        n = Integer.parseInt(stringTokenizer.nextToken());
        m = Integer.parseInt(stringTokenizer.nextToken());
        arr = new int[n];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        for (int i = 0; i <m ; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            a = Integer.parseInt(stringTokenizer.nextToken());
            b = Integer.parseInt(stringTokenizer.nextToken());
            k = Integer.parseInt(stringTokenizer.nextToken());
            solve();
        }
    }

    void solve(){
        res = new int[b-a+1];
        for (int i = a-1; i <b; i++) {
            res[i-a+1] = arr[i];
        }
        Arrays.sort(res);
    }
    public static void main(String[] args) {
        p7469 test = new p7469();
        try{
            test.input();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
