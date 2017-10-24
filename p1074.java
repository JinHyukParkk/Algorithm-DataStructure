import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 10. 23..
 */
public class p1074 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    int n,r,c;
    void start(){
        try{
            input();
            sovle();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    void input() throws IOException{
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        n = Integer.parseInt(stringTokenizer.nextToken());
        r = Integer.parseInt(stringTokenizer.nextToken());
        c = Integer.parseInt(stringTokenizer.nextToken());
    }
    void sovle(){
        System.out.println(zFunc(r, c, n));
    }
    int zFunc(int x,int y,int s) {
        if(s<0){
            return 0;
        }
        int a = (int) Math.pow(2, s - 1);
        if (a <= x && a <= y) {
            return 3 * (int)Math.pow(a,2) + zFunc(x - a, y - a, s - 1);
        } else if (a <= x && y < a) {
            return 2 * (int)Math.pow(a,2) + zFunc(x - a, y, s - 1);
        } else if (x < a && a <= y) {
            return 1 * (int)Math.pow(a,2) + zFunc(x, y - a, s - 1);
        } else {
            return zFunc(x, y, s - 1);
        }
    }


    public static void main(String[] args) {
        new p1074().start();
    }
}

