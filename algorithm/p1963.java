import java.util.*;

/**
 * Created by jinhyuk on 2017. 6. 29..
 */
public class p1963 {
    public static int change(int now, int index, int digit){
        if(index ==0 && digit==0){
            return -1;
        }
        String s = Integer.toString(now);
        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(index, (char)(digit + '0'));
        return Integer.parseInt(sb.toString());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean prime[] = new boolean[10001];

        for (int i = 2; i < 10001; i++) {
            if(prime[i] == false){
                for (int j = i*i; j <10001 ; j+=i) {
                    prime[j] = true;
                }
            }
        }
        for (int i = 0; i < 10001; i++) {
            prime[i] = !prime[i];
        }
        int t = scanner.nextInt();

        while(t-- > 0){

            int n = scanner.nextInt();
            int m = scanner.nextInt();

            boolean check[] = new boolean[10001];
            int dis[] = new int[10001];
            Queue<Integer> queue = new LinkedList<Integer>();

            check[n] = true;
            dis[n] = 0;
            queue.add(n);
            while(!queue.isEmpty()){
                int now = queue.remove();
                for (int i = 0; i <4 ; i++) {
                    for (int j = 0; j <=9 ; j++) {
                        int next = change(now,i,j);
                        if(next != -1){
                            if(prime[next] && check[next] == false){
                                queue.add(next);
                                check[next] = true;
                                dis[next] = dis[now] + 1;
                            }
                        }
                    }
                }

            }
            System.out.println(dis[m]);
        }
    }
}
