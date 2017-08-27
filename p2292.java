import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 8. 11..
 */
public class p2292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 1;
        int lan = 1;
        int s = 6;
        if(n == lan){
            System.out.println(count);
        }else{
            while(true){
                count++;
                lan +=s;
                if(n<=lan){
                    break;
                }
                s+=6;
            }
            System.out.println(count);
        }


    }
}
