import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 19..
 */
public class nhnTest1 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder max = new StringBuilder("");
    StringBuilder min = new StringBuilder("");
    String string[];
    int arr[];
    void input() throws IOException{
        string = bufferedReader.readLine().split("\\s");
        arr = new int[string.length];
        for (int i = 0; i < string.length; i++) {
            arr[i] = Integer.parseInt(string[i]);
        }
    }
    int solve(){
        for (int i = 0; i <string.length ; i++) {
            for (int j = i+1; j <string.length ; j++) {
                if(comp(arr[i]) < comp(arr[j])){
                    swap(i,j);
                }else if(comp(arr[i]) == comp(arr[j])){
                    if(arr[i]%10 < arr[j]%10){
                        swap(i,j);
                    }
                }
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            max.append(arr[i]);
            min.append(arr[arr.length-i-1]);
        }
        return Integer.parseInt(max.toString())+Integer.parseInt(min.toString());
    }
    int comp(int a){
        return (a>=10)?a/10:a;
    }
    void swap(int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        nhnTest1 test = new nhnTest1();
        try{
            test.input();
            System.out.println(test.solve());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

