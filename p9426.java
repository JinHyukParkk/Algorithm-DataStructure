/**
 * Created by jinhyuk on 2017. 8. 24..
 */
public class p9426 {
    void sort(int[] arr, int l, int r){
        int left = l;
        int right = r;
        int pivot = arr[(l+r)/2];

        do{
            while(arr[left] < pivot) left++;
            while(arr[right] > pivot) right--;
            if(left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }while(left <= right);
        if(l < right) sort(arr,l,right);
        if(r > left) sort(arr,left,r);

    }
    public static void main(String[] args) {

    }
}
