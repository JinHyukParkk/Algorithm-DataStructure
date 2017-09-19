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
    void input() throws IOException{
        String num[] = bufferedReader.readLine().split("\\s");
        n = Integer.parseInt(num[0]);
        m = Integer.parseInt(num[1]);
        String str[] = bufferedReader.readLine().split("\\s");
        Arrays.sort(str);
    }
    void printPW(int pos, StringBuilder str, int ja, int mo){

    }
    public static void main(String[] args) {

    }
}
