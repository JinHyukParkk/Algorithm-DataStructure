import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by jinhyuk on 2017. 9. 7..
 */
public class p9375 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    HashMap<String, Integer> hm;
    void input() throws IOException{
        int tc = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < tc ; i++) {
            hm = new HashMap<String, Integer>();
            int n = Integer.parseInt(bufferedReader.readLine());
            for (int j = 0; j < n ; j++) {
                String[] str = bufferedReader.readLine().split(" ");
                String name = str[0];
                String type = str[1];
                Integer value = hm.get(type);
                if(value == null){
                    value = 1;
                }else{
                    value++;
                }
                hm.put(type,value);
            }
            int ans = 1;
            for(int value:hm.values()){
                ans *= (value+1);
            }
            System.out.println(ans-1);
        }
    }
    public static void main(String[] args) {
        p9375 test = new p9375();
        try{
            test.input();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
