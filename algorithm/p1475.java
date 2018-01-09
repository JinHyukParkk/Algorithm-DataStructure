import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 8. 23..
 */
public class p1475 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int arr[] = new int[10];

        int mox = num;
        int max=0;
        while(true){
            if(mox%10 == 6 || mox%10 == 9){
                if(arr[6] < arr[9]){
                    arr[6]++;
                }else{
                    arr[9]++;
                }
            }else{
                arr[mox%10]++;
            }

            mox /= 10;
            if(mox==0){
                break;
            }
        }
        for (int i = 0; i <10 ; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
