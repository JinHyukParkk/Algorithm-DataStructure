import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 9..
 */
public class p1107 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int des, broken_size;
    boolean broken[] = new boolean[10];

    void input() throws IOException{
        des = Integer.parseInt(bufferedReader.readLine());
        broken_size = Integer.parseInt(bufferedReader.readLine());
        String bk[];
        if(broken_size!=0){
            bk = bufferedReader.readLine().split(" ");
            for (int i = 0; i < broken_size; i++) {
                broken[Integer.parseInt(bk[i])] = true;
            }
        }
    }
    int possible(int n){
        if(n==0){
            return (broken[0])?0:1;
        }
        int len = 0;
        while(n!=0){
            if(broken[n%10]) return 0;
            n/=10;
            len++;
        }
        return len;
    }
    int findBottonNum(){
        int count = des-100;
        if(count<0) count = -count;
        for (int i = 0; i <= 999900 ; i++) {
            int len = possible(i);
            if (len > 0) {
                int bet = i - des;
                if(bet<0) bet = -bet;
                if(count>bet+len) count = bet+len;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        p1107 test = new p1107();
        try{
            test.input();
            System.out.println(test.findBottonNum());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
