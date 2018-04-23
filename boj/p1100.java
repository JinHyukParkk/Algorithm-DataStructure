import java.io.*;
import java.util.StringTokenizer;

public class p1100 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        int count = 0;
        for (int i = 1; i <= 8; i++) {
            String s = br.readLine();
            int comp = i%2;
            for (int j = 1; j <= 8; j++) {
                if(comp==1 && j%2==1 && s.charAt(j-1)=='F'){
                    count++;
                }
                if(comp==0 && j%2==0 && s.charAt(j-1)=='F'){
                    count++;
                }
            }
        }
        br.close();
        sb.append(count);
        bw.write(sb.toString());
        bw.close();
    }
}
