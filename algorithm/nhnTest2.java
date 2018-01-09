import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 20..
 */
public class nhnTest2 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int arr[][];
    int n;
    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine());
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            String s[] = bufferedReader.readLine().split("\\s");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(s[j]);
            }
        }

    }
    void solve(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j==n-1) System.out.print(arr[j][i]);
                else System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        nhnTest2 test = new nhnTest2();
        try{
            test.input();
            test.solve();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
