import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 20..
 */
public class p10871 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder stringBuilder = new StringBuilder("");
    int n,k;
    int arr[];
    void input() throws IOException{
        String init[] = bufferedReader.readLine().split("\\s");
        n = Integer.parseInt(init[0]);
        k = Integer.parseInt(init[1]);
        arr = new int[n];
        init = bufferedReader.readLine().split("\\s");
        for (int i = 0; i <n; i++) {
            if(k>Integer.parseInt(init[i])){
                stringBuilder.append(init[i]+" ");
            }
        }
        System.out.println(stringBuilder.toString());

    }
    public static void main(String[] args) {
        p10871 test = new p10871();
        try{
            test.input();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
