import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p2110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        Arrays.sort(arr);

        int ans = 0;
        int left = 1;
        int right = arr[n - 1] - arr[0];
        while (left <= right) {
            int gap = (left + right) / 2;
            int cnt = 1;
            int pi = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] - pi >= gap) {
                    cnt++;
                    pi = arr[i];
                }
            }
            if (cnt >= c) {
                ans = gap;
                left = gap + 1;
            } else {
                right = gap - 1;
            }
        }
        sb.append(ans);
        bw.write(sb.toString());
        bw.close();
    }

}
