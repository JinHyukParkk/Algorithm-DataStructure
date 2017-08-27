import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 6. 29..
 */
public class p10971 {
    public static boolean next_permutation(int a[]){
        int i = a.length-1;
        while(i>0 && a[i-1]>=a[i]){
            i-=1;
        }
        if(i<=0){
            return false;
        }
        int j = a.length-1;
        while(a[i-1]>=a[j]){
            j-=1;
        }
        int temp = a[i-1];
        a[i-1] = a[j];
        a[j] = temp;

        j = a.length-1;

        while(i<j){
            temp = a[j];
            a[j] = a[i];
            a[i] = temp;
            i+=1;
            j-=1;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int arr[][] = new int[n][n];
        int a[] = new int[n];

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i <n ; i++) {
           a[i] = i;
        }

        int ans = Integer.MAX_VALUE;
        do{
            int sum = 0;
            boolean is = true;
            for (int i = 0; i < n-1; i++) {
                if(arr[a[i]][a[i+1]] == 0){
                    is = false;
                }else{
                    sum += arr[a[i]][a[i+1]];
                }
            }
            if(is && arr[a[n-1]][a[0]] !=0){
                sum+=arr[a[n-1]][a[0]];
                if(ans>sum){
                    ans = sum;
                }
            }
        }while(next_permutation(a));
        System.out.println(ans);
    }
}
