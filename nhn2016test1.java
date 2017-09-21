import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by jinhyuk on 2017. 9. 20..
 */
public class nhn2016test1 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String string[];
    int arr[];
    void input() throws IOException{
        string = bufferedReader.readLine().split(" ");
        arr = new int[string.length];
        for (int i = 0; i < string.length; i++) {
            arr[i] = Integer.parseInt(string[i]);
        }
        Arrays.sort(arr);
        int min = arr[1]-arr[0];
        int idx = 0;
        for (int i = 2; i <string.length ; i++) {
            if(arr[i]-arr[i-1]<min && arr[i]<arr[idx]){
                min = arr[i]-arr[i-1];
                idx = i-1;
            }
        }
        System.out.println(arr[idx]+" "+(arr[idx]+min));
    }

    public static void main(String[] args) {
        nhn2016test1 test = new nhn2016test1();
        try{
            test.input();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
