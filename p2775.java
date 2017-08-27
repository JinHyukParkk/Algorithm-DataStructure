import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 8. 22..
 */
public class p2775 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tc = scanner.nextInt();
        for (int i = 0; i <tc ; i++) {
            int floor = scanner.nextInt();
            int num = scanner.nextInt();

            int[] arr = new int[20];
            for (int j = 0; j <arr.length; j++) {
                arr[j] = j;
            }
            int sum = 0;
            for (int j = 0; j <floor ; j++) {
                for (int k = 0; k<=num ; k++) {
                    sum+=arr[k];
                    arr[k]=sum;
                }
                sum = 0;
            }
            System.out.println(arr[num]);

        }

    }
}
