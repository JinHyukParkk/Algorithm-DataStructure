import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class p1026 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];
        int b[] = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
        Arrays.sort(a);
        Arrays.sort(b);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=a[i]*b[n-1-i];
        }
        sb.append(sum);
        bw.write(sb.toString());
        bw.close();
    }
}
