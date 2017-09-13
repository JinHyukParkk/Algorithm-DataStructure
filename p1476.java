import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 9..
 */
public class p1476 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int e,s,m;
    void input() throws IOException{
        String str[] = bufferedReader.readLine().split(" ");
        e = Integer.parseInt(str[0]);
        s = Integer.parseInt(str[1]);
        m = Integer.parseInt(str[2]);
    }
    int findYear(){
       int res= 0;
        int te,ts,tm;
        te = ts = tm = 0;
        while(!(e==te && s==ts && m==tm)){
//            if(e==te && s==ts && m==tm) break;   이게 더 빠르다. &&이라 끝까지 안봐도 됨
            te++;ts++;tm++;
            if(te == 16) te = 1;
            if(ts == 29) ts = 1;
            if(tm == 20) tm = 1;
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        p1476 test = new p1476();
        try{
            test.input();
            System.out.println(test.findYear());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
