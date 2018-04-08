import java.io.*;
import java.util.StringTokenizer;

public class p3046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int avg = Integer.parseInt(st.nextToken());
        int ans = 2*avg-n;
        System.out.println(ans);
    }
}
