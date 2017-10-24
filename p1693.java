import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 10. 24..
 */
public class p1693 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    int n;
    ArrayList<Integer> arrayList[];
    boolean visit[];
    int cache[][];
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
        arrayList = new ArrayList[n+1];
        for (int i = 0; i < n+1; i++) {
            arrayList[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < n-1; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());
            arrayList[x].add(y);
            arrayList[y].add(x);
        }
        visit = new boolean[n+1];
        cache = new int[n+1][19];

    }
    void sovle(){
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i <= 18; i++) {
            ans = Math.min(ans, coloring(1,i));
        }
        System.out.println(ans);
    }
    int coloring(int pos, int color){
        if(cache[pos][color] != 0) return cache[pos][color];
        visit[pos] = true;
        cache[pos][color] = color;
        for (int i = 0; i < arrayList[pos].size(); i++) {
            if(visit[arrayList[pos].get(i)]) continue;
            int choose = Integer.MAX_VALUE;
            for (int j = 1; j <= 18; j++) {
                if(j != color) choose = Math.min(choose, coloring(arrayList[pos].get(i),j));
            }
            cache[pos][color] += choose;

        }
        visit[pos] = false;
        return cache[pos][color];
    }

    public static void main(String[] args) {
        new p1693().start();
    }
}
