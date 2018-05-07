import java.io.*;
import java.util.StringTokenizer;

public class p11478 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        String str = br.readLine();
        char arr[] = str.toCharArray();

        int cnt = 0;
        for (int i = arr.length-1; i>=0 ; i--) {
            for (int j = i; j < arr.length; j++) {
                String t1 = str.substring(i+1);
                String t2 = str.substring(i,j+1);

                if(t1.contains(t2)){ continue;}
                else{ cnt++;}
            }
        }
        sb.append(cnt);
        bw.write(sb.toString());
        bw.close();

    }
}
