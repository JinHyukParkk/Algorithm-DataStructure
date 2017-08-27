import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 8. 9..
 */
public class p10039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;
        for (int i = 0; i <5 ; i++) {
            num = scanner.nextInt();
            if(num<40) {
                num = 40;
            }
            sum += num;
        }
        System.out.println(sum/5);
    }
}
