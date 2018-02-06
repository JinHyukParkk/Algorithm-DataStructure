import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 8. 9..
 */
public class p2920 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res = 0;

        int nu;
        for (int i = 0; i <8 ; i++) {
            nu= scanner.nextInt();
            if(nu == i+1){
                res+=1;
            }else if(nu == 8-i){
                res-=1;
            }else{
                res = 0;
            }
        }
        if(res == 8){
            System.out.println("ascending");
        }else if(res == -8){
            System.out.println("descending");
        }else{
            System.out.println("mixed");
        }
    }
}
