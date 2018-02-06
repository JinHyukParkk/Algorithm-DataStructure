import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 10. 18..
 */
public class p1977 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n, m;
    void start(){
        try{
            input();
            sovle();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine());
        m = Integer.parseInt(bufferedReader.readLine());
    }
    void sovle(){
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i*i <= m; i++) {
            if(n <= i*i && i*i <= m){
                sum+= i*i;
                if(i*i < min) min = i*i;
            }
        }
        if(sum == 0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }

    }
    public static void main(String[] args) {
        new p1977().start();
    }
}
