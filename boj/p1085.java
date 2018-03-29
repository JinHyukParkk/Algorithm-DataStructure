import java.io.*;
import java.util.StringTokenizer;

public class p1085 {


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");


        st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int ans1 = Math.min(x,y);
        int ans2 = Math.min(w-x,h-y);
        int ans = Math.min(ans1,ans2);

        sb.append(ans);
        bw.write(sb.toString());
        bw.close();

    }

}
