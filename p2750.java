import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 8. 23..
 */
public class p2750 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int arr[] = new int[num+4];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        int temp;
        for (int i = 0; i <num ; i++) {
            for (int j = i+1; j <num ; j++) {
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i <num ; i++) {
            System.out.println(arr[i]);
        }
    }
}
