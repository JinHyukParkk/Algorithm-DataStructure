import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");


        int arr[];
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        arr = new int[n];
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int right = arr[n-1];
        int left = 0;
        int mid = 0;
        while(left<=right){
            mid = (left+right)/2;

            int cut = 0;
            long sum = 0;
            for (int i = 0; i < arr.length; i++) {
                cut = arr[i]- mid;
                cut = cut<0?0:cut;
                sum+=cut;
            }
            if(sum >= m){
                left = mid+1;
            }else if(sum < m){
                right = mid-1;
            }
        }
        System.out.println(right);
    }
}
