import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 8. 11..
 */
public class p1193 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n= scanner.nextInt();
        int s = 1;
        int count =2;
        int lan = 1;
        int t;
        int b;

        while(true){
            if(n<=s){
                break;
            }
            count++;
            lan+=1;
            s+=lan;
        }
        if(count%2==0){
            b = count - 1 - (s-n);
            t = count - b;
        }else{
            t = count - 1 -(s-n);
            b = count - t;
        }
        System.out.println(t+"/"+b);
    }
}
