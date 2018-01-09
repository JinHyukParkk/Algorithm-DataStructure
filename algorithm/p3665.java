import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 10. 31..
 */
public class p3665 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    StringBuilder stringBuilder;
    int n;
    int arr[];
    int m;
    LinkedList<Integer> graph[];
    int indegree[];

    void start() {
        try {
            int tc = Integer.parseInt(bufferedReader.readLine());
            for (int i = 0; i < tc; i++) {
                input();
                sovle();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void input() throws IOException {
        n = Integer.parseInt(bufferedReader.readLine());
        arr = new int[n+1];
        indegree = new int[n+1];
        graph = new LinkedList[n+1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 1; i <= n; i++) {
            graph[i] = new LinkedList<Integer>();
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        for (int i = 1; i <= n; i++) {
            for (int j = i+1; j <= n; j++) {
                graph[arr[j]].offer(arr[i]);
                indegree[arr[i]]++;
            }
        }
        m = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < m; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int from = Integer.parseInt(stringTokenizer.nextToken());
            int to = Integer.parseInt(stringTokenizer.nextToken());
            if(graph[from].contains(to)){
                int idx = graph[from].indexOf(to);
                graph[from].remove(idx);
                graph[to].offer(from);
                indegree[from]++;
                indegree[to]--;
            }else {
                int idx = graph[to].indexOf(from);
                graph[to].remove(idx);
                graph[from].offer(to);
                indegree[to]++;
                indegree[from]--;
            }
        }
    }

    void sovle() {
        stringBuilder = new StringBuilder("");
        Queue<Integer> searchQ = new LinkedList<Integer>();
        int count=1;
        int rank[] = new int[n+1];
        for (int i = 1; i <= n; i++) {
            if(indegree[arr[i]] == 0){
                searchQ.offer(arr[i]);
            }
        }
        int res = 1;
        while(count<=n) {
            if(searchQ.isEmpty()){
                res = -1;
                break;
            }
            if(searchQ.size()>1){
                res = 0;
                break;
            }
            int zeroIndegreeNode = searchQ.poll();
            rank[count] = zeroIndegreeNode;
            count++;
            for (int linkedNode : graph[zeroIndegreeNode]) {
                indegree[linkedNode]--;
                if (indegree[linkedNode] == 0)
                    searchQ.offer(linkedNode);
            }
        }
        if(res==1){
            for (int i = count-1; 0<i; i--) {
                stringBuilder.append(rank[i]+" ");
            }
            System.out.println(stringBuilder.toString());
        }else if(res ==0){
            System.out.println("?");
        }else{
            System.out.println("IMPOSSIBLE");
        }

    }

    public static void main(String[] args) {
        new p3665().start();
    }
}
