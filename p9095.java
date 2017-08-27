import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 6. 28..
 */
public class p9095 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int t = scanner.nextInt();
        int a[] = new int[12];
        a[1]=1;
        a[2]=2;
        a[3]=4;
        for (int i = 4; i <12 ; i++) {
            a[i] = a[i-1]+a[i-2]+a[i-3];
        }
        for (int i = 0; i <t ; i++) {
            int n = scanner.nextInt();
            System.out.println(a[n]);
        }
    }
}
