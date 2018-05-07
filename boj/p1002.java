import java.io.*;
import java.util.StringTokenizer;

public class p1002 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {

            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            double r = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
            if(x1 == x2 && y1 == y2 && r1 == r2){
                sb.append(-1);
            }else if(r > r1+r2 || x1 == x2 && y1== y2 && r1 != r2 || r< Math.abs(r1-r2)){
                sb.append(0);
            }else if(r == r1+r2 || Math.abs(r1-r2) == r){
                sb.append(1);
            }else{
                sb.append(2);
            }
            sb.append("\n");
        }
        br.close();
        bw.write(sb.toString());
        bw.close();
    }
}