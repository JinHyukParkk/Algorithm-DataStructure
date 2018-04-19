import java.io.*;
import java.util.StringTokenizer;

public class p2960 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");


        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        br.close();

        int cnt = 0;
        int ans = 0;
        boolean arr[] = new boolean[n+1];

        for (int i = 2; i <= n; i++) {
            if(arr[i] == false){
                for (int j = i; j <=n; j+=i) {
                    if(arr[j] == false){
                        arr[j] = true;
                        cnt++;
                    }

                    if(cnt == c){
                        ans = j;
                        break;

                    }
                }
            }
            if(cnt == c){
                break;
            }
        }
        sb.append(ans);
        bw.write(sb.toString());
        bw.close();
    }
}
