import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by jinhyuk on 2017. 9. 18..
 */
public class p1759 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n, m;
    String sarr[];
    void input() throws IOException{
        String num[] = bufferedReader.readLine().split("\\s");
        n = Integer.parseInt(num[0]);
        m = Integer.parseInt(num[1]);
        sarr = bufferedReader.readLine().split("\\s");
        Arrays.sort(sarr);
    }
    void solve(int p, String str, int ja, int mo){
        if(str.length() == n && ja>=2 && mo>=1){
            System.out.println(str);
        }else if(str.length() == n) return;

        for (int i = p; i < m ; i++) {
            if(sarr[i].equals("a") || sarr[i].equals("e") || sarr[i].equals("o") || sarr[i].equals("i") || sarr[i].equals("u")){
                solve(i+1, str+sarr[i], ja, mo+1);
            }else{
                solve(i+1, str+sarr[i],ja+1,mo);

            }
        }
    }
    public static void main(String[] args) {
        p1759 test = new p1759();
        try{
            test.input();
            test.solve(0,"",0,0);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
