import java.util.*;

/**
 * Created by jinhyuk on 2017. 6. 29..
 */
public class p1697 {
    public static final int MAX_VALUE = 1000000;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int old = scanner.nextInt();
        int young = scanner.nextInt();

        Queue<Integer> q = new LinkedList<Integer>();

        boolean check[] = new boolean[MAX_VALUE];
        int dis[] = new int[MAX_VALUE];
        q.add(old);
        while(!q.isEmpty()){
            int now = q.remove();
            if(young == now){
                break;
            }
            if(now-1>=0 && check[now-1]== false) {
                q.add(now - 1);
                check[now - 1] = true;
                dis[now - 1] = dis[now] + 1;
            }
            if(now+1<MAX_VALUE && check[now+1]==false) {
                q.add(now + 1);
                check[now + 1] = true;
                dis[now + 1] = dis[now] + 1;
            }
            if(2*now < MAX_VALUE && check[2*now] == false){
                q.add(2*now);
                check[2*now] = true;
                dis[2*now] = dis[now] + 1;
            }
        }
        System.out.println(dis[young]);
    }
}
