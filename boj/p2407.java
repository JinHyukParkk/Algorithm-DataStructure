import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Created by jinhyuk on 2017. 9. 6..
 */
public class p2407 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BigInteger arr[][];
    void input() throws IOException{
        String s[] = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        arr = new BigInteger[n+1][m+1];
        arr[1][0] = arr[1][1] = BigInteger.ONE;
        for (int i = 2; i <=n ; i++) {
            int j = 0;
            while(j<=i){
                if(i==j || j==0){
                    arr[i][j] = BigInteger.ONE;
                }else{
                    arr[i][j] = arr[i-1][j-1].add(arr[i-1][j]);
                }
                j++;
                if(j>m){
                    break;
                }
            }
        }
        System.out.println(arr[n][m]);
    }
    void combi_f(int n, int m){

    }

    public static void main(String[] args) {
        p2407 test = new p2407();
        try{
            test.input();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
