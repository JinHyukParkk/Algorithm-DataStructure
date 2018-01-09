import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 9. 21..
 */
public class p2455 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    void input() throws IOException{
        int sum =0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <4 ; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            sum -= Integer.parseInt(stringTokenizer.nextToken());
            sum += Integer.parseInt(stringTokenizer.nextToken());
            if(sum>max) max = sum;
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        p2455 test = new p2455();
        try{
            test.input();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
