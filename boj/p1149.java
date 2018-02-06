import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 10..
 */
public class p1149 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n;
    int arr[][];
    int d[][];
    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine());
        arr = new int[n+1][3];
        d = new int[n+1][3];
        for (int i = 1; i <= n; i++) {
            String str[] = bufferedReader.readLine().split(" ");
            arr[i][0] = Integer.parseInt(str[0]);
            arr[i][1] = Integer.parseInt(str[1]);
            arr[i][2] = Integer.parseInt(str[2]);
        }
        d[0][0] = d[0][1] = d[0][2] = arr[0][0] = arr[0][1] = arr[0][2] = 0;
    }
    int findMin(){
        for (int i = 1; i <= n ; i++) {
            d[i][0] = Math.min(d[i-1][1],d[i-1][2]) + arr[i][0];
            d[i][1] = Math.min(d[i-1][0],d[i-1][2]) + arr[i][1];
            d[i][2] = Math.min(d[i-1][0],d[i-1][1]) + arr[i][2];
//            arr[i][0] += Math.min(arr[i-1][1],arr[i-1][2]);
//            arr[i][1] += Math.min(arr[i-1][0],arr[i-1][2]);
//            arr[i][2] += Math.min(arr[i-1][0],arr[i-1][1]);
        }
//        return Arrays.stream(arr[n-1]).min().getAsInt();

        int min = d[n][0];
        for (int i = 0; i < 3; i++) {
            if(min>d[n][i]){
                min = d[n][i];
            }
        }
        return min;

//        Arrays.sort(arr[n-1]);
//        return arr[n-1][0];
    }

    public static void main(String[] args) {
        p1149 test = new p1149();
        try{
            test.input();
            System.out.println(test.findMin());
            test.bufferedReader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
