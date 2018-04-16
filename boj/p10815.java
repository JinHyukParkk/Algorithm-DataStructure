import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p10815 {

    static int arr[];

    static boolean bst(int x){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid] == x){
                return true;
            }else if(arr[mid] < x){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        int n = Integer.parseInt(br.readLine());
        arr = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int x = Integer.parseInt(st.nextToken());
            if(bst(x)){
                sb.append(1+" ");
            }else{
                sb.append(0+" ");
            }
        }
        bw.write(sb.toString());
        bw.close();
    }
}
