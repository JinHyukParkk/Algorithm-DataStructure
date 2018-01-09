import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 10. 25..
 */
public class p10827 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    BigDecimal n,k,res;
    void start(){
        try{
            input();
            sovle();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    void input() throws IOException{
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        n = new BigDecimal(stringTokenizer.nextToken());
        k = new BigDecimal(stringTokenizer.nextToken());
        res = BigDecimal.ONE;
        bufferedReader.close();
    }
    void sovle(){
        while(k!=BigDecimal.ZERO){
            res = res.multiply(n);
            k = k.subtract(BigDecimal.ONE);
        }
        System.out.println(res.toPlainString());
    }

    public static void main(String[] args) {
        new p10827().start();
    }
}

