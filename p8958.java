import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 8. 8..
 */
public class p8958 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        scanner.nextLine();
        int sum = 0, plus = 1;
        for (int i = 0; i <test ; i++) {
            String ox = scanner.nextLine();
            for (int j = 0; j <ox.length() ; j++) {
                if(String.valueOf(ox.charAt(j)).equals("O")){
                    sum+=plus;
                    plus+=1;
                }else{
                    plus=1;
                }
            }
            System.out.println(sum);
            sum = 0;
            plus=1;
        }

    }
}
