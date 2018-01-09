import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 10. 1..
 */
public class p7568 {
    //브루트 포스 문제. 다 비교 해보기
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    int n;
    int arr[][];
    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine());
        arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            arr[i][0] = Integer.parseInt(stringTokenizer.nextToken());
            arr[i][1] = Integer.parseInt(stringTokenizer.nextToken());
            arr[i][2] = 1;
        }
    }
    void solve(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1] && i!=j){
                    arr[i][2]++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i][2]+" ");
        }
    }
    public static void main(String[] args) {
        p7568 test = new p7568();
        try{
            test.input();
            test.solve();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
