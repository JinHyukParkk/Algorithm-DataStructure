import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 6. 28..
 */
public class p10819 {
    public static boolean next_permutation(int[] a) {
        int i = a.length-1;
        while (i > 0 && a[i-1] >= a[i]) {
            i -= 1;
        }

        // 마지막 순열
        if (i <= 0) {
            return false;
        }

        int j = a.length-1;
        while (a[j] <= a[i-1]) {
            j -= 1;
        }

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
    public static int calculate(int arr[]){
        int sum =0;
        for (int i = 1; i < arr.length; i++) {
            sum += Math.abs(arr[i-1]-arr[i]);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int ans = 0;
        do{
            int temp = calculate(arr);
            ans = Math.max(ans, temp);
        } while(next_permutation(arr));

        System.out.println(ans);
    }
}
