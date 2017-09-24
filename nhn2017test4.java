import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by jinhyuk on 2017. 9. 23..
 */
public class nhn2017test4 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    final int dx[] = {0,-1,0,1};
    final int dy[] = {-1,0,1,0};
    int n;
    int map[][];
    boolean check[][];
    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine());
        map = new int[n][n];
        check = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            String str[] = bufferedReader.readLine().split("\\s");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(str[j]);
            }
        }
    }

    void solve(){
        int area = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (!check[i][j] && map[i][j] != 0) {
                    area++;
                    int cnt = dfs(i, j, area, 0);
                    arrayList.add(cnt);
                }
            }
        }
        Collections.sort(arrayList);
        System.out.println(area);
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.size()-1 == i){
                System.out.println(arrayList.get(i));
            }else{
                System.out.print(arrayList.get(i) + " ");
            }
        }

    }
    int dfs(int row, int col, int name, int count) {
        count++;
        check[row][col] = true;
        for (int i = 0; i < 4; i++) {
            int nextdx = row + dx[i];
            int nextdy = col + dy[i];
            if (nextdx < 0 || nextdx >= n || nextdy < 0 || nextdy >= n) continue;
            if (map[nextdx][nextdy] == 0) continue;
            if (check[nextdx][nextdy]) continue;

            count = dfs(nextdx, nextdy, name, count);
        }

        return count;
    }
    public static void main(String[] args) {
        nhn2017test4 test =new nhn2017test4();
        try{
            test.input();
            test.solve();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
