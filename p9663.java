import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 11. 8..
 */
public class p9663 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter printWriter = new PrintWriter(new BufferedOutputStream(System.out));
    StringTokenizer stringTokenizer;
    StringBuilder stringBuilder = new StringBuilder("");

    int path[];
    int n,ans;
    void start(){
        try{
            input();
            solve();
            printWriter.print(stringBuilder.toString());
            printWriter.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine());
        path = new int[n+1];

    }
    void solve(){
        for (int i = 0; i < n; i++) {
            path[0] = i;
            nQueue(i,0);
        }
        stringBuilder.append(ans);
    }
    void nQueue(int x, int y){
        for (int i = 0; i < y; i++) {
            if(path[i] == x || Math.abs(x-path[i]) == y-i) return;
        }
        if(y==n-1){
            ans++;
            return;
        }
        for (int i = 0; i < n; i++) {
            path[y+1] = i;
            nQueue(i,y+1);
        }
    }

    public static void main(String[] args) {
        new p9663().start();
    }
}
