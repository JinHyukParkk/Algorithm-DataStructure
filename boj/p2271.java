import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p2271 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max,arr[i]*(n-i));
        }
        sb.append(max);
        bw.write(sb.toString());
        bw.close();
    }
}
