import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 11..
 */
public class p9095 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n;
    int arr[] = new int[12];
    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine());
    }
    void caseNum() throws IOException{
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        for (int i = 4; i < 12; i++) {
            arr[i] = arr[i-3]+arr[i-2]+arr[i-1];
        }
        for (int i = 0; i < n ; i++) {
            System.out.println(arr[Integer.parseInt(bufferedReader.readLine())]);
        }
    }

    public static void main(String[] args) {
        p9095 test = new p9095();
        try{
            test.input();
            test.caseNum();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
