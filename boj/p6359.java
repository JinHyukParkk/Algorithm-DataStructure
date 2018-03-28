import java.io.*;
import java.util.StringTokenizer;

public class p6359 {

    static int arr[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            int n = Integer.parseInt(br.readLine());
            arr = new int[n+1];

            for (int j = 1; j <= n; j++) {
                int x = j;
                while(x <= n){
                    if(arr[x] == 0) arr[x] = 1;
                    else arr[x] = 0;
                    x += j;
                }
            }
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if(arr[j] == 1) count++;
            }
            sb.append(count);
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.close();
    }
}
