import java.io.*;
import java.util.StringTokenizer;

public class p2914 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        br.close();
        sb.append(n*(min-1)+1);
        bw.write(sb.toString());
        bw.close();
    }
}
