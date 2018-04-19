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
        int right = 0;
        int left = 0;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        arr = new int[n];
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            right = right<arr[i]?arr[i]:right;
        }
        int ans = 0;
        int mid = 0;
        while(right-left>1){
            long sum = 0L;
            mid = (left+right)/2;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i]-mid<0?0:arr[i]-mid;
            }
            if(sum >= m){
                ans = ans<mid?mid:ans;
                left = mid;
            }else {
                right = mid;
            }
        }
        System.out.println(ans);
    }
}
