import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 8. 8..
 */
public class p2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res[] = new int[10];

        int num = 1;
        for (int i = 0; i <3 ; i++) {
            num*=scanner.nextInt();
        }
        while(true){
            if(num<10){
                res[num]+=1;
                break;
            }
            res[num%10]+=1;
            num/=10;
        }
        for (int i = 0; i <10 ; i++) {
            System.out.println(res[i]);
        }
    }
}
