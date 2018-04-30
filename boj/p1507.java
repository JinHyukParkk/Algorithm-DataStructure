import java.io.*;
import java.util.StringTokenizer;

public class p1507 {

    static int arr[][];
    static int chk[][];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        chk = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = chk[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if(arr[i][j] > arr[i][k]+arr[k][j]){
                        System.out.println(-1);
                        return;
                    }
                    if(i==k || j==k) continue;
                    if(arr[i][j] == arr[i][k]+arr[k][j]){
                        chk[i][j] = 0;
                    }
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                ans += chk[i][j];
            }
        }
        sb.append(ans);
        bw.write(sb.toString());
        bw.close();
    }
}
