import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 10. 25..
 */
public class p1019 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder stringBuilder = new StringBuilder("");
    int n;
    int arr[] = new int[10];
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
        bufferedReader.close();
    }
    void sovle(){
        int start = 1;
        int p = 1;
        while(start<=n){
            while(n%10 != 9 && start<=n){
                insertArr(n,p);
                n--;
            }
            if(n<start) break;
            while(start%10 !=0 && start<=n){
                insertArr(start,p);
                start++;
            }
            start/=10;
            n/=10;
            for (int i = 0; i < 10; i++) {
                arr[i] += (n-start+1) * p;
            }
            p *= 10;
        }
        for (int i = 0; i < 10; i++) {
            stringBuilder.append(arr[i]+" ");
        }
        stringBuilder.append("\n");
        System.out.println(stringBuilder.toString());
    }
    void insertArr(int x,int p){
        while(0<x){
            arr[x%10] += p;
            x/=10;
        }
    }

    public static void main(String[] args) {
        new p1019().start();
    }
}

