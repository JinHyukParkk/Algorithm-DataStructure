import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 8. 23..
 */

public class p6064 {
    public static long lcm(long a, long b) {
        int gcd_value = gcd((int)a, (int)b);

        if (gcd_value == 0) return 0; // 인수가 둘다 0일 때의 에러 처리

        return Math.abs( (a * b) / gcd_value );
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return Math.abs(a);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tc = scanner.nextInt();
        for (int i = 0; i <tc ; i++) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();

            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if(x==m){
                x=0;
            }
            if(y==n){
                y=0;
            }
            int p = x;
            boolean pass = false;
            while(p<=lcm((long)m,(long)n)){
                if(p%n==y){
                    pass= true;
                    break;
                }
                p+=m;

            }
            if(pass){
                System.out.println(p);
            }else{
                System.out.println("-1");
            }

        }
    }
}
