import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 7..
 */
public class p6591 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    void input() throws IOException{
        while(true){
            String s[] = bufferedReader.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            if(n==0 && m==0){
                break;
            }
            if(n-m<m){
                m = n-m;
            }
            long ans = 1;
            for (int i = 1; i <= m ; i++) {
                ans *=n-i+1;
                ans/=i;
            }
            System.out.println(ans);
        }
    }

    public static void main(String[] args) {
        p6591 test = new p6591();
        try{

            test.input();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
