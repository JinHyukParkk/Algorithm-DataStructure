import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 6. 28..
 */
public class p1107 {
    public static Boolean broken[] = new Boolean[10];

    public static int possible(int n){
        if(n==0){
            if(broken[0]) {
                return 0;
            }else{
                return 1;
            }
        }
        int len = 0;
        boolean is = false;
        while(n!=0){
            if(broken[n%10]){
                return 0;
            }
            len++;
            n/=10;
        }
        return len;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int channel = scanner.nextInt();
        int b_c = scanner.nextInt();
        for (int i = 0; i < 10; i++) {
            broken[i]=false;
        }
        for (int i = 0; i < b_c; i++) {
            int b = scanner.nextInt();
            broken[b] = true;
        }
        int betw = channel-100;
        if(betw<0){
            betw = -betw;
        }
        for (int i = 0; i < 1000000; i++) {
            int len=possible(i);
            if(len>0){
                int p = channel-i;
                if(p<0) {
                    p = -p;
                }
                if(betw > len+p){
                    betw=len+p;
                }

            }
        }
        System.out.println(betw);
    }
}
