import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 10. 28..
 */
public class p1015 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    StringBuilder stringBuilder = new StringBuilder("");
    int n;
    int arr[];
    void start(){
        try{
            input();
            solve();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine());
        arr = new int[n];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
    }

    void solve(){
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                } else if (arr[i] == arr[j] && i > j) {
                    count++;
                }
            }
            stringBuilder.append(count + " ");
        }
        System.out.println(stringBuilder.toString());

    }

    public static void main(String[] args) {
        new p1015().start();
    }
}
