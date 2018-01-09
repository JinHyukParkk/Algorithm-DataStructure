import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 3..
 */
public class p2748 {

    long arr[];
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    void input() throws IOException{
        long n = Long.parseLong(bufferedReader.readLine());

        //피사노의 수!!
        int p = 1000000/10*15;
        long res= n%p;
        arr = new long[p+1];
        if(n ==0 ){
            arr[0]=0;
        }else{
            arr[0]=0;
            arr[1]=1;
        }
        for (int i = 2; i <=p ; i++) {
            arr[i]= arr[i-1]+arr[i-2];
            arr[i] %=1000000;
        }
        System.out.println(arr[(int)res]);

    }
    public static void main(String[] args) {
        p2748 test = new p2748();
        try{
            test.input();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
