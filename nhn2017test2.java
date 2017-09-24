import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 23..
 */
public class nhn2017test2 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String init[];
    void input() throws IOException{
        init = bufferedReader.readLine().split("\\s");

    }
    void solve(){
        int ro = Integer.parseInt(init[2]);
        int tmp;
        char in[] = init[3].toCharArray();
        if(init[0].equals("encrypt")){
            for (int i = 0; i <ro ; i++) {
                for (int j = 0; j <init[3].length() ; j++) {
                    tmp = init[1].charAt(j%init[1].length())-'a';
                    if((int)in[j]+tmp>122){
                        in[j] = (char)((int)in[j]+tmp-122+96);
                    }else{
                        in[j] = (char)((int)in[j]+tmp);
                    }
                }
            }
        }else if(init[0].equals("decrypt")){
            for (int i = 0; i <ro ; i++) {
                for (int j = 0; j <init[3].length() ; j++) {
                    tmp = init[1].charAt(j%init[1].length())-'a';
                    if((int)in[j]-tmp<96){
                        in[j] = (char)((int)in[j]-tmp-97+123);
                    }else{
                        in[j] = (char)((int)in[j]-tmp);
                    }
                }
            }
        }
        for(char a : in){
            System.out.print(a);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        nhn2017test2 test = new nhn2017test2();
        try {
            test.input();
            test.solve();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
