import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 8. 10..
 */
public class p1316 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        int count = 0;
        for (int i = 0; i <t ; i++) {
            boolean check = true;
            String n = scanner.nextLine();
            int arr[] = new int[26];
            for (int j = 1; j <n.length() ; j++) {
                if(arr[(int)n.charAt(j)-97] == 1){
                    check = false;
                    break;
                }
                if((int)n.charAt(j-1)-97 != (int)n.charAt(j)-97){
                    arr[(int)n.charAt(j-1)-97] = 1;
                }
            }
            System.out.println(n+check);

            if(check){
                count++;
            }
        }
        System.out.println(count);

    }
}
