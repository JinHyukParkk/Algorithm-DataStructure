import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 8. 7..
 */
public class p1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String st;
        st = scanner.nextLine();
        String word = "";
        for (int i = 0; i <st.length() ; i++) {
            String c = String.valueOf(st.charAt(i));
            if(c.equals(" ")){
                word = "";
            }else{
                if(word.length() == 0){
                    count++;
                }
                word = c;
            }
        }
        System.out.println(count);



    }
}
