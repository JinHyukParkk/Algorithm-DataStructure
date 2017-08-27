import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 6. 28..
 */
public class p1476 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int e = s.nextInt();
        int sun = s.nextInt();
        int m = s.nextInt();

        int te =1;
        int tsun=1;
        int tm=1;

        int year=1;

        while(true){
            if(e==te && sun==tsun && m==tm){
                break;
            }
            te++; tsun++; tm++;
            if(te==16)  te=1;
            if(tsun==29)    tsun=1;
            if(tm==20)  tm=1;
            year++;
        }
        System.out.println(year);
    }
}
