import java.io.*;
import java.util.StringTokenizer;

public class p1182 {
    static int n,r;
    static int arr[];
    static int count;
    static void brute(int x, int step){
        if(step == n){
            if(x == r){
                count++;
            }
            return;
        }
        brute(x+arr[step],step+1);
        brute(x,step+1);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
        brute(0,0);
        if(r == 0){
            count-=1;
        }
        sb.append(count);
        bw.write(sb.toString());
        bw.close();



    }

}
