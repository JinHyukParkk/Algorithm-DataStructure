import java.io.*;
import java.util.StringTokenizer;

public class p10797 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int count = 0;
        for (int i = 0; i < 5; i++) {
            int a = Integer.parseInt(st.nextToken());
            if(a%10 == n) count++;
        }
        sb.append(count);
        bw.write(sb.toString());
        bw.close();

    }
}
