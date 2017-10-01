import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 9. 30..
 */
public class p1547 {
    //그냥 swap 문제
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    int m;
    int arr[] = new int[3];

    void input() throws IOException{
        for (int i = 0; i <3 ; i++) {
            arr[i] = i;
        }
        m = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < m; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            swap(Integer.parseInt(stringTokenizer.nextToken()),Integer.parseInt(stringTokenizer.nextToken()));
        }
    }
    void solve(){
        for (int i = 0; i < 3; i++) {
            if(arr[i] == 0) System.out.println(i+1);
        }
    }
    void swap(int a, int b){
        int temp = arr[a-1];
        arr[a-1] = arr[b-1];
        arr[b-1] = temp;
    }
    public static void main(String[] args) {
        p1547 test = new p1547();
        try{
            test.input();
            test.solve();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}