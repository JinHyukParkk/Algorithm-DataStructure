import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 10. 1..
 */
public class p1038 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n;
    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine());
    }
    void solve(){
        int count = 0;
        long num = 0;
        if(n > 1022){ System.out.println(-1); return;}
        while(true){
            boolean check = true;
            long temp = num;
            long jump = 1;
            long before = -1;
            while(temp!=0){
                if(temp%10<=before){
                    check = false;
                }
                if(!check && temp%10 > before) break;
                jump *=10;
                before = temp%10;
                temp /= 10;
            }
            if(check){
                if(n==count++){
                    break;
                }
                num++;
            }else{
                jump /= 10;
                num+=jump;
                num = num/jump*jump;
                continue;
            }

        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        p1038 test = new p1038();
        try{
            test.input();
            test.solve();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
