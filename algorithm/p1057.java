import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 9. 23..
 */
public class p1057 {
    // 토너먼트 문제. 한 사람이 경기를 한 후 다음 경기 때 몇번째가 되는지 구하는게 중요.
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    int n,a,b;
    void input() throws IOException {
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        n = Integer.parseInt(stringTokenizer.nextToken());
        a = Integer.parseInt(stringTokenizer.nextToken());
        b = Integer.parseInt(stringTokenizer.nextToken());
    }

    void solve(){
        int count = 1;
        while((int)((double)a/2+0.5) != (int)((double)b/2+0.5)){
            a = a%2==0? a/2:a/2+1;
            b = b%2==0? b/2:b/2+1;
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        p1057 test = new p1057();
        try{
            test.input();
            test.solve();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
