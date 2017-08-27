import java.util.*;

/**
 * Created by jinhyuk on 2017. 6. 30..
 */
public class p9019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while(t-- > 0){
            boolean check[] = new boolean[10001];
            int dis[] = new int[10001];
            int point[] = new int[10001];
            char word[] = new char[10001];
            Queue<Integer> queue = new LinkedList<Integer>();

            int n = scanner.nextInt();
            int m = scanner.nextInt();

            check[n] = true;
            dis[n] = 0;
            point[n] = -1;
            queue.add(n);
            while(!queue.isEmpty()){
                int now = queue.remove();
                int next = (2*now) % 10000;
                if(check[next] == false){
                    queue.add(next);
                    dis[next] = dis[now] + 1;
                    word[next] = 'D';
                    check[next] = true;
                    point[next] = now;
                }
                next = now-1;
                if(next == -1){
                    next = 9999;
                }
                if(check[next] == false){
                    queue.add(next);
                    dis[next] = dis[now] + 1;
                    word[next] = 'S';
                    check[next] = true;
                    point[next] = now;
                }
                next = (now%1000)*10+(now/1000);
                if(check[next] == false){
                    queue.add(next);
                    dis[next] = dis[now] + 1;
                    word[next] = 'L';
                    check[next] = true;
                    point[next] = now;
                }
                next = (now%10)*1000+(now/10);
                if(check[next] == false){
                    queue.add(next);
                    dis[next] = dis[now] + 1;
                    word[next] = 'R';
                    check[next] = true;
                    point[next] = now;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            while(m != n){
                stringBuilder.append(word[m]);
                m = point[m];
            }
            System.out.println(stringBuilder);
        }
    }


}
