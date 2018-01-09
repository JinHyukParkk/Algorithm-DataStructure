import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 10. 19..
 */
public class p1780 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    int n;
    int arr[][];
    int res[] = new int[3];

    void start(){
        try{
            input();
            sovle();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    void input() throws IOException {
        n = Integer.parseInt(bufferedReader.readLine());
        arr = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }

        }
    }
    void sovle(){
        check(1,n,1,n);
        for (int i = 0; i < 3; i++) {
            System.out.println(res[i]);
        }
    }
    void check(int x,int x1, int y, int y1){
        boolean paper = true;
        for (int i = y; i <= y1; i++) {
            for (int j = x; j <= x1; j++) {
                if(arr[y][x] != arr[i][j]){
                    paper = false;
                }
            }
            if(!paper){
                break;
            }
        }
        if(paper){
            res[arr[y][x]+1]+=1;
        }else{
            int length = (x1-x+1)/3;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j <3; j++) {
                    check(x+i*length,x+i*length+length-1, y+j*length, y+j*length+length-1);
                }
            }
        }
    }

    public static void main(String[] args) {
        new p1780().start();
    }
}
