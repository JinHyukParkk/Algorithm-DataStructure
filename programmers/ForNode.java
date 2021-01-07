import java.util.*;
import java.util.LinkedList;

public class ForNode {
    public static void main(String[] args) {
         int edge[][] = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
         int n = 6;

         System.out.println(new ForNode().solution(n, edge));
    }


    public int solution(int n, int[][] edge) {
        int d[] = new int[n+1];
        boolean map[][] = new boolean[n+1][n+1];

        for (int i = 0; i < edge.length; i++) {
            map[edge[i][0]][edge[i][1]] = true;
            map[edge[i][1]][edge[i][0]] = true;
        }

        Queue<Integer> q = new LinkedList<Integer>();

        int max = 0;
        int count = 0;

        q.add(1);
        while(!q.isEmpty()) {
            int i = q.poll();

            for (int j = 2; j <= n ; j++) {
                // 안들렸고, 연결된 
                if ( d[j] == 0 && map[i][j]) {
                    d[j] = d[i] + 1;
                    q.add(j);
                    max = Math.max(max, d[j]);
                }
            }
        }

        for (int i : d) {
            if (i == max) count++;
        }

        return count;
    }

}
