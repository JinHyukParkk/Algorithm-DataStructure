import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 8. 11..
 */
public class p2941 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        scanner.close();

        String[] replace = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (int i = 0; i <replace.length ; i++) {
            text = text.replaceAll(replace[i],"1");
        }
        System.out.println(text.length());

    }
}
