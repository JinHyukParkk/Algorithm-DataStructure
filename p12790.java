import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 11. 8..
 */
public class p12790 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    StringTokenizer stringTokenizer;
    StringBuilder stringBuilder = new StringBuilder("");

    int arr[];
    void start(){
        try{
            int tc = Integer.parseInt(bufferedReader.readLine());
            for (int i = 0; i < tc; i++) {
                input();
                solve();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    void input() throws IOException{
        arr = new int[4];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        for (int i = 0; i < 4; i++) {
            if(i == 0 || i == 1){
                arr[i]+=Integer.parseInt(stringTokenizer.nextToken());
                if(arr[i]<1) arr[i]=1;
            }else if(i == 2){
                arr[i]+=Integer.parseInt(stringTokenizer.nextToken());
                if(arr[i]<0) arr[i]=0;
            }else{
                arr[i]+=Integer.parseInt(stringTokenizer.nextToken());
            }
        }
    }
    void solve(){
        int res = arr[0]+5*arr[1]+2*arr[2]+2*arr[3];
        out.println(res);
        out.flush();
    }

    public static void main(String[] args) {
        new p12790().start();
    }

}
