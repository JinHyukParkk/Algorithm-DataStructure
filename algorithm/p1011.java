import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 8. 13..
 */
public class p1011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        for (int i = 0; i <tc ; i++) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            double d = second - first;


            double speed = Math.floor(Math.sqrt(d));
            double distance = Math.pow(speed, 2);
            double plus = d - distance;

            plus = Math.ceil(plus /speed);
            System.out.println((int)(speed*2)-1+(int)plus);
        }
    }
}
