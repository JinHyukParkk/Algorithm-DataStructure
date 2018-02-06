import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 8. 21..
 */
public class p10250 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();

        for (int i = 0; i <tc ; i++) {
            int col = scanner.nextInt();
            int row = scanner.nextInt();
            int num = scanner.nextInt();

            int r_r = num/col;
            int r_c = num%col;
            if(r_c==0){
                r_c = col;
                r_r--;
            }
            int result = r_c*100+r_r+1;
            System.out.println(result);
        }
    }
}
