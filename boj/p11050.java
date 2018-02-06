import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 4..
 */
public class p11050 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    long arr[][];
    void input() throws IOException{
        String s[] = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        arr = new long[n+1][n+1];
        arr[1][0] = arr[1][1] = 1;

        for (int i = 2; i <= n ; i++) {
            for (int j = 0; j <= k ; j++) {
                if(i==j || j == 0){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
                }
                arr[i][j]%=10007;
            }
        }
        System.out.println(arr[n][k]);
    }

    public static void main(String[] args) {
        p11050 test = new p11050();
        try{
            test.input();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
