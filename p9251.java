import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 19..
 */
public class p9251 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String a,b;
    int dp[][];
    void input() throws IOException{
         a = bufferedReader.readLine();
         b = bufferedReader.readLine();
        dp = new int[1004][1004];
    }
    void sovle(){
        for (int i = 0; i <a.length() ; i++) {
            for (int j = 0; j <b.length(); j++) {
                if(a.charAt(i) == b.charAt(j)){
                    dp[i+1][j+1] += dp[i][j]+1;

                }else{
                    dp[i+1][j+1] = Math.max(dp[i][j+1],dp[i+1][j]);
                }
            }
        }
        System.out.println(dp[a.length()][b.length()]);
    }

    public static void main(String[] args) {
        p9251 test = new p9251();
        try{
            test.input();
            test.sovle();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
