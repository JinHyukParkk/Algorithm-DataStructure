import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 8. 24..
 */
public class p2108 {
    Scanner scanner = new Scanner(System.in);
    int arr[];
    int sum = 0;
    int count[];


    void display(){
        System.out.println(Math.round((double) sum/arr.length));
        System.out.println(arr[arr.length / 2]);
        max_count();
        System.out.println(arr[arr.length-1]-arr[0]);

    }
    void max_count(){
        int max=0;
        int s_max=0;
        int mode=0;
        int s_mode=0;
        for (int i = 0; i <count.length ; i++) {
            if(max < count[i]){
                s_max = max;
                max = count[i];
                s_mode = mode;
                mode = i;
            }
        }
        if(max == s_max){
            if(4000 < s_mode){
                System.out.println(8001-s_mode);
            }else{
                System.out.println(mode);
            }
        }else{
            System.out.println(mode);
        }
    }
    void input(){
        int size = scanner.nextInt();
        arr = new int[size];
        count = new int[8001];

        for (int i = 0; i < arr.length; i++) {
            int num = scanner.nextInt();
            sum+=num;
            if(num<0){
                count[8001+num]++;
            }else{
                count[num]++;
            }

            arr[i] = num;
        }
    }

    void sort(int[] arr){
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        p2108 test = new p2108();
        test.input();
        test.sort(test.arr);
        test.display();

    }
}
