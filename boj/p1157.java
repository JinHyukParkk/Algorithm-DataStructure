import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 8. 9..
 */
public class p1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine().toUpperCase();
        int arr[] = new int[100];
        char ch[] = line.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            arr[ch[i]] += 1;
        }
        int max = 0;
        int max_res=0;
        int res = 0;
        for (int i = 65; i < 97; i++) {
            if(arr[i]>max){
                max = arr[i];
                max_res = i;
            }
        }
        for (int i = 65; i < 97; i++) {
            if(arr[i] == max){
                res++;
            }
        }
        if(res != 1){
            System.out.println("?");
        }else{
            System.out.println((char) max_res);
        }
    }
}
