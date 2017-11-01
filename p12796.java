import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 10. 28..
 */
public class p12796 {
    //연쇄 행렬 동적 계획법
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    int n;
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
    }
    void sovle(){

    }

    public static void main(String[] args) {
        new p12796().start();
    }
}

