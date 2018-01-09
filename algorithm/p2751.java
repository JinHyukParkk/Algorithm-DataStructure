import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 8. 23..
 */
public class p2751 {

    public static void print_arr(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void merge(int[] a, int[] b, int[] c){
        int ia = 0;
        int ib = 0;
        int ic = 0;

        while(ia<a.length){
            if(ib<b.length){
                if(a[ia]<b[ib]){
                    c[ic] = a[ia];
                    ia++;
                }else {
                    c[ic] = b[ib];
                    ib++;
                }
                ic++;
            }else{
                while(ia<a.length){
                    c[ic] = a[ia];
                    ia++;
                    ic++;
                }
            }
        }
        while(ib<b.length){
            c[ic] = b[ib];
            ic++;
            ib++;
        }
    }
    public static void merge_sort(int[] arr){
        int n = arr.length;
        if(n==1){
            return;
        }
        int[] temp1 = new int[n/2];
        int[] temp2 = new int[n-n/2];

        for (int i = 0; i <n/2 ; i++) {
            temp1[i] = arr[i];
        }
        for (int i = 0; i <n-n/2 ; i++) {
            temp2[i] = arr[n/2+i];
        }
        merge_sort(temp1);
        merge_sort(temp2);
        merge(temp1,temp2,arr);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        merge_sort(arr);
        print_arr(arr);
    }
}
