import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 9. 30..
 */
public class p10219 {
    //고기 뒤집기 문제.. 그냥 뒤집으면 됨 ..
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    String arr[];
    int tc, h, w;

    void start() throws IOException{
        tc = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < tc; i++) {
            input();
            solve();
        }
    }
    void input() throws IOException{
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        h = Integer.parseInt(stringTokenizer.nextToken());
        w = Integer.parseInt(stringTokenizer.nextToken());
        arr = new String[h];
        for (int i = 0; i < h; i++) {
            arr[i] = bufferedReader.readLine();
        }
    }
    void solve(){
        for (int i = h-1; i >=0 ; i--) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        p10219 test = new p10219();
        try{
            test.start();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
