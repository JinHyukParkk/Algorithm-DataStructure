import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 20..
 */
public class p2577 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int arr[] = new int[10];
    void input() throws IOException{
        int sum = 1;
        for (int i = 0; i <3 ; i++) {
            sum*=Integer.parseInt(bufferedReader.readLine().replaceAll(" ",""));
        }
        while(sum!=0){
            arr[sum%10]+=1;
            sum/=10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        p2577 test = new p2577();
        try{
            test.input();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
