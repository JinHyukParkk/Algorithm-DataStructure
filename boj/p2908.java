import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 8. 11..
 */
public class p2908 {
    public static String reverseString(String s) {
        return ( new StringBuffer(s) ).reverse().toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fir = scanner.nextInt();
        int sec = scanner.nextInt();

        int f = Integer.parseInt(reverseString(String.valueOf(fir)));
        int s = Integer.parseInt(reverseString(String.valueOf(sec)));

        if(f>s){
            System.out.println(f);
        }else{
            System.out.println(s);
        }

    }
}
