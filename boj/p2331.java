import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class p2331 {
    static int p;
    static int cal(int a){
        int sum =0;
        while(a != 0){
            sum += Math.pow((a%10),p);
            a /=10;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        p = Integer.parseInt(st.nextToken());

        ArrayList<Integer> al = new ArrayList<>();

        boolean check[] = new boolean[1000004];
        while(!check[n]){
            check[n] = true;
            al.add(n);
            n = cal(n);
        }
        int count=0;
        while(true){
            if(al.get(count) != n){
                count++;
            }else{
                break;
            }

        }
        sb.append(count);
        System.out.println(sb.toString());

    }
}
