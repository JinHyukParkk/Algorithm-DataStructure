import java.io.*;
import java.util.StringTokenizer;

public class p11003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        int arr[] = new int[n+1];
        int dq[] = new int[5000004];
        int front = 2500000;
        int rear = 2500000;

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(front == rear){
                dq[--front] = arr[i];
            }else{
                while(front != rear && dq[rear-1] > arr[i]){
                    dq[--rear] = 0;
                }
                dq[rear++] = arr[i];
            }
            if(i>l && dq[front] == arr[i-l]) dq[front++] = 0;
            sb.append(dq[front]+" ");
        }
        br.close();
        bw.write(sb.toString());
        bw.close();
    }
}
