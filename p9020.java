import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 8. 28..
 */
public class p9020 {
    Scanner scanner = new Scanner(System.in);
    void input(){
        int tc = scanner.nextInt();
        for (int i = 0; i < tc ; i++) {
            int n = scanner.nextInt();
            for (int j = n/2; j < n ; j++) {
                if(prime(j) && prime(n-j)){
                    System.out.println((n-j)+" "+j);
                    break;
                }
            }
        }
    }
    boolean prime(int n){
        for (int i = 2; i*i <= n; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        p9020 test = new p9020();
        test.input();
    }
}
