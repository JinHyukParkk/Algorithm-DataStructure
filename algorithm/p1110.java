import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 8. 7..
 */
public class p1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tn = n;
        int count=0;
        while(true){
            count++;
            int first = tn/10;
            int second = tn-first*10;
            int ne = first+second;
            if(ne > 9){
                ne = ne%10;
            }
            ne = second*10+ne;
            if(ne == n){
                break;
            }
            tn = ne;
        }
        System.out.println(count);

    }
}
