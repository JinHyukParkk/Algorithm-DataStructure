import java.io.*;
import java.util.StringTokenizer;

public class p1654 {

    static long first = 1;
    static long last;
    static long arr[];
    static int n;

    static long search(){
        long mid = 0;
        while (first <= last) {
            mid = (first + last) / 2;
            int total = 0;

            for (int i = 0; i < arr.length; i++) {
                int result = (int) (arr[i] / mid);
                total += result;
            }

            if (total >= n)
                first = mid + 1;
            else
                last = mid - 1;
        }
        return last;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        arr = new long[k];

        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            last = Math.max(last, arr[i]);
        }

        sb.append(search());
        bw.write(sb.toString());
        bw.close();

    }
}
