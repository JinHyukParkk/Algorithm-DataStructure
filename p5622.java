import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 8. 11..
 */
public class p5622 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i <text.length() ; i++) {
            int ch = (int)text.charAt(i);
            if(text.charAt(i) == '1'){
                sum+=2;
            }
            if(ch<68){
                sum+=3;
            }else if(ch<71){
                sum+=4;
            }else if (ch < 74) {
                sum+=5;

            }else if (ch < 77) {
                sum+=6;

            }else if (ch < 80) {
                sum+=7;

            }else if (ch < 84) {
                sum+=8;

            }else if (ch < 87) {
                sum+=9;

            }else if (ch < 91) {
                sum+=10;

            }else{
                sum+=11;
            }
        }
        System.out.println(sum);
    }
}

