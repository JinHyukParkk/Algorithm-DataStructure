import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by jinhyuk on 2017. 9. 19..
 */
//위상 정렬
public class p1005 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int tc;
    int n,role_n,exit;
    LinkedList<Integer> graph[];
    int time[];
    int dp[];
    int indegree[];

    void start() throws IOException{
        tc = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < tc; i++) {
            input();
            findmin();
        }
    }
    void input() throws IOException{
        String num[] = bufferedReader.readLine().split("\\s");
        n = Integer.parseInt(num[0]);
        role_n = Integer.parseInt(num[1]);
        indegree = new int[n+1];
        time = new int[n+1];
        dp = new int[n+1];
        graph = new LinkedList[n+1];
        String stime[] = bufferedReader.readLine().split("\\s");
        for (int i = 1; i <= n; i++) {
            time[i] = Integer.parseInt(stime[i-1]);
            graph[i] = new LinkedList<>();
        }
        for (int i = 0; i <role_n ; i++) {
            String role[] = bufferedReader.readLine().split("\\s");
            graph[Integer.parseInt(role[0])].add(Integer.parseInt(role[1]));
            indegree[Integer.parseInt(role[1])]++;
        }
        exit = Integer.parseInt(bufferedReader.readLine());
    }
    void findmin(){
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = 1; i <=n ; i++) {
            if(indegree[i]==0){
                queue.offer(i);
                dp[i] = time[i];
            }
        }
        while(!queue.isEmpty() && indegree[exit]!=0) {
            int temp = queue.poll();
            for(int linkednode : graph[temp]){
                if(dp[temp]+time[linkednode]>dp[linkednode]){
                    dp[linkednode] = dp[temp]+time[linkednode];
                }
                indegree[linkednode]--;
                if(indegree[linkednode]==0){
                    queue.offer(linkednode);
                    time[linkednode] = dp[linkednode];
                }
            }
        }
        System.out.println(dp[exit]);
    }

    public static void main(String[] args) {
        p1005 test = new p1005();
        try{
            test.start();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
