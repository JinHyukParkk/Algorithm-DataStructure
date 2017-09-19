
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 16..
 */
public class test {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder stringBuilder = new StringBuilder("");
    int n;
    int arr[], arr1[];
    int res[];
    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine());
        arr = new int[n+1];
        arr1 = new int[n+1];
        res = new int[n+1];
        String a[] = bufferedReader.readLine().split("\\s+");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(a[i]);
        }
        String ar[] = bufferedReader.readLine().split("\\s+");
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(ar[i]);
        }
    }
    void print(){
        for (int i = 0; i < n; i++) {
            res[i] = arr[i] | arr1[i];
            String a = Integer.toBinaryString(res[i]);
            int d = 5-a.length();
            for (int j = 0; j <d ; j++) stringBuilder.append(" ");
            for (int j = 0; j < a.length(); j++) {
                if(a.charAt(j) == '1'){
                    stringBuilder.append("#");
                }else{
                    stringBuilder.append(" ");
                }
            }
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder.toString());

    }
    public static void main(String[] args) {
        test test = new test();
        try{
            test.input();
            test.print();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
