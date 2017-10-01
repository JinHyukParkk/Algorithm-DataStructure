import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by jinhyuk on 2017. 9. 25..
 */
public class p14729 {
    //정렬 문제. 성적 출력
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n;
    float arr[];
    void input() throws IOException{
        int n = Integer.parseInt(bufferedReader.readLine());
        arr = new float[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Float.parseFloat(bufferedReader.readLine());
        }

    }
    void solve(){
        Arrays.sort(arr);
        for (int i = 0; i < 7; i++) {
            System.out.format("%.3f\n",arr[i]);
        }
    }
    public static void main(String[] args) {
        p14729 test = new p14729();
        try{
            test.input();
            test.solve();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
