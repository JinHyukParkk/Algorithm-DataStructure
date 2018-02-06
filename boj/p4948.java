import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 8. 28..
 */
public class p4948 {
    Scanner scanner = new Scanner(System.in);
    void input(){
        while(true){
            int n = scanner.nextInt();
            if(n == 0 ){
                break;
            }else{
                prime(n);
            }
        }
    }
    void prime(int n){
        int count = 0;
        boolean b = true;
        for (int i = n+1; i <=2*n ; i++) {
            b = true;
            for (int j = 2; j*j <=i ; j++) {
                if(i%j==0){
                    b = false;
                    break;
                }
            }
            if(b) count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        p4948 test = new p4948();
        test.input();
    }
}
