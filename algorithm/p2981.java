import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 9. 21..
 */
public class p2981 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Integer> list = new ArrayList<Integer>();
    int n;
    int arr[];

    void input() throws IOException{
        n = Integer.parseInt(new StringTokenizer(bufferedReader.readLine()).nextToken());
        arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = Integer.parseInt(new StringTokenizer(bufferedReader.readLine()).nextToken());
        }
    }
    int gcd(int p,int q){
        if(q==0){
            return p;
        }else{
            return gcd(q,p%q);
        }
    }
    void solve(){
        Arrays.sort(arr);
        int g;
        g = arr[1]-arr[0];
        for (int i = 2; i <n ; i++) {
            g= gcd(g,arr[i]-arr[i-1]);
        }
        for (int i = 2; i <=g ; i++) {
            if (g % i == 0) {
                list.add(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }


    public static void main(String[] args) {
        p2981 test = new p2981();
        try{
            test.input();
            test.solve();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

