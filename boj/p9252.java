import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 20..
 */
public class p9252 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder st = new StringBuilder("");
//    String s[][];
    String a,b;
    int dp[][];
    void input() throws IOException {
        a = bufferedReader.readLine();
        b = bufferedReader.readLine();
        dp = new int[a.length()+1][b.length()+1];
//        s = new String[a.length()+1][b.length()+1];
//        for (int i = 0; i <a.length() ; i++) {
//            for (int j = 0; j <b.length() ; j++) {
//                s[i][j] = "";
//            }
//        }
    }
    void solve(){
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) != b.charAt(j)) {
                    dp[i + 1][j + 1] = Math.max(dp[i + 1][j], dp[i][j + 1]);
//                    s[i+1][j+1] = dp[i + 1][j]>dp[i][j + 1]?s[i+1][j]:s[i][j+1];
                } else {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
//                    s[i+1][j+1]=s[i][j]+a.charAt(i);
                }
            }
        }
        System.out.println(dp[a.length()][b.length()]);
//        System.out.println(s[a.length()][b.length()]);
        int x = a.length();
        int y = b.length();
        while(dp[x][y]!=0){
            if(dp[x][y] == dp[x-1][y]) x--;
            else if(dp[x][y] == dp[x][y-1]) y--;
            else if(dp[x][y]-1 == dp[x-1][y-1]) {st.insert(0,String.valueOf(a.charAt(x-1)));x--;y--;}
        }
        System.out.println(st.toString());
    }

    public static void main(String[] args) {
        p9252 test = new p9252();
        try{
            test.input();
            test.solve();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
