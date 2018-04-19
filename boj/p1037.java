import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        int c = Integer.parseInt(br.readLine());
        int arr[] = new int[c];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < c; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        Arrays.sort(arr);
        int ans = 0;
        if(c == 1){
            ans+=arr[0]*arr[0];
        }else{
            ans+=arr[0]*arr[c-1];
        }
        sb.append(ans);
        bw.write(sb.toString());
        bw.close();
    }
}
