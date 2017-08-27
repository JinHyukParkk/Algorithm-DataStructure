import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 8. 26..
 */
public class p1811 {
    Scanner scanner = new Scanner(System.in);
    int num;
    String arr[];
    void input(){
        num = scanner.nextInt();
        arr = new String[num];
        for (int i = 0; i < num ; i++) {
            arr[i] = scanner.nextLine();
        }
    }
    public static void main(String[] args) {

    }
}
