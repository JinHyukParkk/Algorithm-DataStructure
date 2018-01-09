import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 8. 28..
 */
public class p2581 {
    Scanner scanner = new Scanner(System.in);

    int min = 10001;
    int sum = 0;
    void input(){
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        prime(m,n);
    }
    void prime(int m, int n){
        boolean b = true;
        if(m == 1){
            m =2;
        }
        if(n ==1){
            return;
        }
        for (int i = m; i <= n ; i++) {
            b = true;
            for (int j = 2; j*j <= i ; j++) {
                if(i%j==0){
                    b = false;
                    break;
                }
            }
            if(b){
                sum +=i;
                if(i<min){
                    min = i;
                }
            }
        }
    }
    void display(){
        if(sum ==0){
            System.out.println("-1");
        }else{
            System.out.println(sum);
            System.out.println(min);
        }

    }
    public static void main(String[] args) {
        p2581 test = new p2581();
        test.input();
        test.display();
    }
}
