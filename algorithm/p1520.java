import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 9. 19..
 */
public class p1520 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    int n,m;
    int arr[][];
    int dp[][];
    int dx[]= {1,-1,0,0};
    int dy[]= {0,0,1,-1};
    void input() throws IOException{
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        n = Integer.parseInt(stringTokenizer.nextToken());
        m = Integer.parseInt(stringTokenizer.nextToken());
        arr = new int[n+1][m+1];
        dp = new int[n+1][m+1];

        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                dp[i][j] = -1;
            }
        }
    }

    int solve(int x, int y){
        if(x == n-1 && y == m-1){
            return 1;
        }
        if(dp[x][y]>-1){
            return dp[x][y];
        }
        int temp =0;
        for (int i = 0; i <4; i++) {
            int nextx = x+dx[i];
            int nexty = y+dy[i];
            if(nextx<0 || nextx>=n || nexty<0 || nexty>=m){
                continue;
            }
            if(arr[nextx][nexty]<arr[x][y]){
                temp += solve(nextx,nexty);
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        p1520 test = new p1520();
        try{
            test.input();
            System.out.println(test.solve(0, 0));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
