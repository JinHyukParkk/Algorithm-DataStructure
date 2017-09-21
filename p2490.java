import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 20..
 */
public class p2490 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int arr[][] = new int[3][4];

    void input() throws IOException{
        String init[];
        int n=0;
        for (int i = 0; i <3 ; i++) {
            init = bufferedReader.readLine().split(" ");
            for (int j = 0; j <4 ; j++) {
                if(init[j].equals("0")){
                    n++;
                }
            }
            if(n==4){
                System.out.println("D");
            }else if(n==3){
                System.out.println("C");
            }else if(n==2){
                System.out.println("B");
            }else if(n==1){
                System.out.println("A");
            }else{
                System.out.println("E");
            }
            n=0;
        }
    }

    public static void main(String[] args) {
        p2490 test = new p2490();
        try{
            test.input();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
