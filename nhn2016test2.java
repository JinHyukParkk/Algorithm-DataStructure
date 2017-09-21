import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 20..
 */
public class nhn2016test2 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String string[];
    int mo,ja;
    void input() throws IOException{
        string = bufferedReader.readLine().split(" ");

    }
    void solve(){
        for (int i = 0; i <string.length ; i++) {
            if(findmo(string[i])){
                mo++;
            }
            if(findja(string[i])){
                ja++;
            }
        }
        System.out.println(mo);
        System.out.println(ja);

    }
    boolean findmo(String s){
        int count =0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'o' || s.charAt(i) == 'i' || s.charAt(i) == 'u' || s.charAt(i) == 'e'){
                count++;
            }else{
                count=0;
            }
            if(count==2){
                return true;
            }
        }
        return false;
    }
    boolean findja(String s){
        int count =0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'o' || s.charAt(i) == 'i' || s.charAt(i) == 'u' || s.charAt(i) == 'e'){
                count=0;
            }else{
                count++;
            }
            if(count==3){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        nhn2016test2 test = new nhn2016test2();
        try{
            test.input();
            test.solve();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
