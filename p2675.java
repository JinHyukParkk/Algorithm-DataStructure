import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 8. 9..
 */
public class p2675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        while (test-- > 0){
            int n = scanner.nextInt();
            String s = scanner.nextLine();
            for (int i = 0; i <s.length() ; i++) {
                for (int j = 0; j <n ; j++) {
                    if(!String.valueOf(s.charAt(i)).equals(" ")){
                        System.out.print(s.charAt(i));
                    }

                }
            }
            System.out.println();
        }
    }
}
