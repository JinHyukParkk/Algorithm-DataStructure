import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 8. 28..
 */
public class p1978 {
    Scanner scanner = new Scanner(System.in);
    int count = 0;

    void input(){
        int n = scanner.nextInt();

        for (int i = 0; i < n ; i++) {
            prime(scanner.nextInt());
        }
    }
    void prime(int n){
        if(n<=1) return;
        for (int i = 2; i*i <= n ; i++) {
            if(n%i==0){
                return;
            }
        }
        count++;
        return;
    }
    void display(){
        System.out.println(count);
    }

    public static void main(String[] args) {
        p1978 test = new p1978();
        test.input();
        test.display();
    }
}
