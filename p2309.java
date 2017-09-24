import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by jinhyuk on 2017. 9. 22..
 */
public class p2309 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int arr[] = new int[9];
    void input() throws IOException{
        for (int i = 0; i <9 ; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
    }
    void solve(){
        int rf=0, rl=0, sum=0;
        Arrays.sort(arr);
        for (int i = 0; i <9 ; i++) {
            for (int j = i+1; j <9 ; j++) {
                for (int k = 0; k < 9; k++) {
                    if(k != i && k != j){
                        sum+=arr[k];
                    }
                }
                if(sum==100){
                    for (int k = 0; k <9 ; k++) {
                        if(k != i && k != j){
                            System.out.println(arr[k]);
                        }
                    }
                    break;
                }else{
                    sum = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        p2309 test = new p2309();
        try{
            test.input();
            test.solve();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
