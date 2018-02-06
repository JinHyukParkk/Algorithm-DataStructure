import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 9..
 */
public class p1451 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int arr[][];
    long s[][];
    int n,m;
    long poSum(int x, int y, int x1, int y1){
        return s[x1][y1]-s[x-1][y1]-s[x1][y-1]+s[x-1][y-1];
    }
    void input() throws IOException{
        String str[] = bufferedReader.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);
        arr = new int[n+1][m+1];
        s = new long[n+1][m+1];
        for (int i = 1; i <= n; i++) {
            String num = bufferedReader.readLine();
            for (int j = 1; j <= m; j++) {
                arr[i][j] = num.charAt(j-1)-'0';
            }
        }
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= m ; j++) {
                s[i][j] = s[i-1][j]+s[i][j-1]-s[i-1][j-1]+(long)arr[i][j];
            }
        }
    }
    void findMax(){
        long ans = 0;
        for (int i = 1; i <= n-2 ; i++) {
            for (int j = i+1; j <= n-1 ; j++) {
                long r1 = poSum(1,1,i,m);
                long r2 = poSum(i+1,1,j,m);
                long r3 = poSum(j+1,1,n,m);
                if(ans<r1*r2*r3) ans = r1*r2*r3;
            }
        }
        for (int i = 1; i <= m-2 ; i++) {
            for (int j = 1; j <= m-1 ; j++) {
                long r1 = poSum(1,1,n,i);
                long r2 = poSum(1,i+1,n,j);
                long r3 = poSum(1,j+1,n,m);
                if(ans<r1*r2*r3) ans = r1*r2*r3;

            }
        }
        for (int i = 1; i <=m-1 ; i++) {
            for (int j = 1; j <=n-1 ; j++) {
                long r1 = poSum(1,1,n,i);
                long r2 = poSum(1,i+1,j,m);
                long r3 = poSum(j+1,i+1,n,m);
                if(ans<r1*r2*r3) ans = r1*r2*r3;

                r1 = poSum(1,1,j,m);
                r2 = poSum(j+1,1,n,i);
                r3 = poSum(j+1,i+1,n,m);
                if(ans<r1*r2*r3) ans = r1*r2*r3;

                r1 = poSum(1,1,j,i);
                r2 = poSum(j+1,1,n,i);
                r3 = poSum(1,i+1,n,m);
                if(ans<r1*r2*r3) ans = r1*r2*r3;

                r1 = poSum(1,1,j,i);
                r2 = poSum(1,i+1,j,m);
                r3 = poSum(j+1,1,n,m);
                if(ans<r1*r2*r3) ans = r1*r2*r3;
            }
        }
        System.out.println(ans);
    }
    
    public static void main(String[] args) {
        p1451 test = new p1451();
        try{
            test.input();
            test.findMax();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
