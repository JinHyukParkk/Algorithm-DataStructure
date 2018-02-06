import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by jinhyuk on 2017. 9. 1..
 */
public class p1260 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    Queue<Integer> queue = new LinkedList<Integer>();
    boolean check[];
    int arr[][];
    int n;

    void input() throws Exception{
        String[] pas = bufferedReader.readLine().split(" ");
        n = Integer.parseInt(pas[0]);
        int line = Integer.parseInt(pas[1]);
        int start = Integer.parseInt(pas[2]);
        check = new boolean[1009];
        arr = new int[1005][1005];

        for (int i = 0; i <n ; i++) {
            String pas1[] = bufferedReader.readLine().split(" ");
            int r = Integer.parseInt(pas1[0]);
            int c = Integer.parseInt(pas1[1]);
            arr[r][c] = arr[c][r] =1;

        }
        dfs(start);
        for (int i = 1; i <=n ; i++) {
            check[i] = false;
        }
        System.out.println();
        bfs(start);

    }
    void dfs(int x){
        System.out.print(x + " ");
        check[x] = true;
        for (int i = 1; i <= n ; i++) {
            if(!check[i] && arr[x][i] == 1)
                dfs(i);
        }
    }
    void bfs(int x){
        queue.offer(x);
        check[x] = true;
        int temp;
        while(!queue.isEmpty()){
            temp = queue.poll();
            System.out.print(temp + " ");
            for (int i = 1; i <=n ; i++) {
                if(!check[i] && arr[x][i] == 1){
                    queue.offer(i);
                    check[i] = true;
                }
            }
        }

    }
    public static void main(String[] args) {
        p1260 test = new p1260();
        try{
            test.input();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

