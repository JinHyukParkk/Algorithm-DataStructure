import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 8. 27..
 */
public class p1181 {
    Scanner scanner = new Scanner(System.in);
    HashSet<String> hs;
    String[] arr;
    void input(){
        int n = scanner.nextInt();
        scanner.nextLine();
        hs = new HashSet<>();
        for (int i = 0; i < n ; i++) {
            hs.add(scanner.nextLine());
        }
        int size =hs.size();
        arr = new String[size];
        hs.toArray(arr);
    }
    void sort(String...arr){
        int i,j;
        Arrays.sort(arr, (o1, o2) -> Integer.compare(o1.length(), o2.length()));
        for (i = 0; i < arr.length; i++) {
            int len = arr[i].length();
            for (j = i+1; j < arr.length; j++) {
                int tmp = arr[j].length();
                if(len != tmp) break;
            }
            Arrays.sort(arr,i,j);
            i = j-1;
        }
    }
    void display(String...arr){
        for (String i : arr) {
            if(!i.equals("")) System.out.println(i);
        }
    }
    public static void main(String[] args) {
        p1181 test = new p1181();
        test.input();
        test.sort(test.arr);
        test.display(test.arr);
    }
}
