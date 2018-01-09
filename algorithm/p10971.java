import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 13..
 */
public class p10971 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n;
    int arr[][];
    int ar[];

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
        arr = new int[n][n];
        ar = new int[n];
        for (int i = 0; i < n ; i++) {
            String str[] = bufferedReader.readLine().split("\\s+");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }
        for (int i = 0; i < n; i++) {
            ar[i] = i;
        }

    }
    int findMin(){
        int res = Integer.MAX_VALUE;
        do{
            boolean is  = true;
            int sum = 0;
            for (int i = 0; i < n-1; i++) {
                if(arr[ar[i]][ar[i+1]] != 0)    sum+=arr[ar[i]][ar[i+1]];
                else    is = false;
            }
            if(is && arr[ar[n-1]][ar[0]] != 0){
                sum+=arr[ar[n-1]][ar[0]];
                if(res>sum) res = sum;
            }
        }while(next_permutation(ar));
        return res;
    }
    public static void main(String[] args) {
        p10971 test = new p10971();
        try{
            test.input();
            System.out.println(test.findMin());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
