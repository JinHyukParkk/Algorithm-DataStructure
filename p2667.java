import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by jinhyuk on 2017. 10. 26..
 */
public class p2667 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n;
    int map[][];
    boolean check[][];
    final int dx[] = {0,0,-1,1};
    final int dy[] = {-1,1,0,0};
    ArrayList<Integer> res = new ArrayList<Integer>();

    void start(){
        try{
            input();
            sovle();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine());
        map = new int[n][n];
        check = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            String str = bufferedReader.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = str.charAt(j) - 48;
            }
        }
    }
    void sovle(){
        int area =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(map[i][j] != 0 && !check[i][j]){
                    area++;
                    res.add(dfs(i,j,0));
                }
            }
        }
        Collections.sort(res);
        System.out.println(area);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }
    int dfs(int x,int y,int count){
        count++;
        check[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx<0 || n<=nx || ny<0 || n<=ny) continue;
            if(map[nx][ny] == 0) continue;
            if(check[nx][ny]) continue;
            count = dfs(nx,ny,count);
        }
        return count;
    }

    public static void main(String[] args) {
        new p2667().start();
    }
}
