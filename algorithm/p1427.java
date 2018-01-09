import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 8. 25..
 */
public class p1427 {
    Scanner scanner = new Scanner(System.in);
    int n;
    int arr[];
    void input(){
        n = scanner.nextInt();
    }
    void parse(){
        String strN = String.valueOf(n);
        arr = new int[strN.length()];
        for (int i = 0; i <strN.length() ; i++) {
            arr[i] = strN.charAt(i);
        }
    }
    void sort(){
        Arrays.sort(arr);
    }
    void display(){
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]-48);
        }
    }
    public static void main(String[] args) {
        p1427 test = new p1427();
        test.input();
        test.parse();
        test.sort();
        test.display();
    }
}
