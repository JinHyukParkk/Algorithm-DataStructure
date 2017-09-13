import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by jinhyuk on 2017. 9. 11..
 */
public class p10819 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n;
    int arr[];
    public static boolean next_permutation(int[] a) {
        int i = a.length-1;
        while (i > 0 && a[i-1] >= a[i]) i -= 1;
        // 마지막 순열
        if (i <= 0) return false;

        int j = a.length-1;
        while (a[j] <= a[i-1]) j -= 1;

        int temp = a[i-1];
        a[i-1] = a[j];
        a[j] = temp;

        j = a.length-1;
        while (i < j) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i += 1;
            j -= 1;
        }
        return true;
    }
    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine());
        arr = new int[n];
        String str[] = bufferedReader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
    }
    void findMax(){
        Arrays.sort(arr);
        int res = 0;
        do{
            int t = abs(arr);
            res = Math.max(t,res);
        }while(next_permutation(arr));
        System.out.println(res);
    }
    int abs(int[] a){
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum += Math.abs(a[i]-a[i-1]);
        }
        return sum;
    }
    public static void main(String[] args) {
        p10819 test = new p10819();
        try{
            test.input();
            test.findMax();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
