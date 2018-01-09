import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 10. 25..
 */
public class p7569 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    int arr[][][];
    int dx[] = {0,0,-1,1,0,0};
    int dy[] = {-1,1,0,0,0,0};
    int dz[] = {0,0,0,0,1,-1};
    int x,y,z;
    Queue<Tomato> q = new LinkedList<Tomato>();


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
        x = Integer.parseInt(stringTokenizer.nextToken());
        y = Integer.parseInt(stringTokenizer.nextToken());
        z = Integer.parseInt(stringTokenizer.nextToken());
        arr = new int[z][y][x];
        for (int i = 0; i < z; i++) {
            for (int j = 0; j < y; j++) {
                stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                for (int k = 0; k < x; k++) {
                    arr[i][j][k] = Integer.parseInt(stringTokenizer.nextToken());
                    if(arr[i][j][k] == 1){
                        q.add(new Tomato(k,j,i));
                    }
                }
            }
        }
    }
    void sovle(){
        while(!q.isEmpty()){
            Tomato toma = q.poll();
            for (int i = 0; i < 6; i++) {
                int nx = toma.x+dx[i];
                int ny = toma.y+dy[i];
                int nz = toma.z+dz[i];
                if(0<=nx && nx<x && 0<=ny && ny<y && 0<=nz && nz<z && arr[nz][ny][nx] == 0){
                    arr[nz][ny][nx] = arr[toma.z][toma.y][toma.x]+1;
                    q.add(new Tomato(nx,ny,nz));
                }
            }
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < z; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < x; k++) {
                    if(arr[i][j][k] == 0){
                        System.out.println(-1);
                        return;
                    }
                    ans = Math.max(ans,arr[i][j][k]);
                }
            }
        }
        System.out.println(ans-1);

    }

    public static void main(String[] args) {
        new p7569().start();
    }
}
class Tomato {
    int x,y,z;
    Tomato(int x, int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;

    }
}

