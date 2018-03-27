import java.io.*;
import java.util.StringTokenizer;

public class p5585 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        int won = Integer.parseInt(br.readLine());
        won = 1000-won;

        int r[] = {500,100,50,10,5,1};

        int count = 0;
        for (int i = 0; i < r.length; i++) {
            if(won == 0) break;
            if(won >= r[i]){
                int c = won/r[i];
                count += c;
                won -= r[i]*c;
            }
        }
        sb.append(count);
        bw.write(sb.toString());
        bw.close();
    }
}
