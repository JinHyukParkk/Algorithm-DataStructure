import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 10. 23..
 */
public class p1992 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder stringBuilder = new StringBuilder("");
    int n;
    int arr[][];
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
        arr = new int[n+1][n+1];
        for (int i = 1; i < n+1; i++) {
            String str = bufferedReader.readLine();
            for (int j = 1; j < n+1; j++) {
                arr[i][j] = (int)str.charAt(j-1) - 48;
            }
        }
    }
    void sovle(){
        partition(1,n,1,n);
        System.out.println(stringBuilder.toString());
    }
    void partition(int x, int x1, int y, int y1){
        if(check(x, x1, y, y1)){
            stringBuilder.append(arr[x][y]);
        }else{
            stringBuilder.append("(");
            partition(x, x + (x1 - x + 1) / 2 - 1, y, y + (y1 - y + 1) / 2 - 1);
            partition(x, x+(x1-x+1)/2-1,y+(y1-y+1)/2,y1);
            partition(x + (x1 - x + 1) / 2, x1, y, y + (y1 - y + 1) / 2 - 1);
            partition(x + (x1 - x + 1) / 2, x1, y + (y1 - y + 1) / 2, y1);
            stringBuilder.append(")");
        }

    }
    boolean check(int x, int x1, int y, int y1){
        int ch = arr[x][y];
        for (int i = x; i <=x1; i++) {
            for (int j = y; j <=y1; j++) {
                if(arr[x][y] != arr[i][j]) return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        new p1992().start();
    }
}