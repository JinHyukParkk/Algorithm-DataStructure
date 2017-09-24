import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 23..
 */
public class nhn2017test3 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    char arr[][];
    int res[][];
    int n;
    int x;
    //next_pumatation.......ㅜㅜ
    void input() throws IOException{
//        System.out.println(((int)('B'-'A'))*16);
        n = Integer.parseInt(bufferedReader.readLine());
        arr = new char[n+2][n+2];
        res = new int[n+2][n+2];

        for (int i = 0; i <n+2 ; i++) {
            for (int j = 0; j <n+2 ; j++) {
                arr[i][j] = '0';
            }
        }
        for (int i = 1; i <=n; i++) {
            String str[] = bufferedReader.readLine().split("\\s");
            for (int j = 1; j <=n; j++) {
                arr[i][j] = str[j-1].charAt(0);
            }
        }

    }
    void solve(){
        int l = 0;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n; j++) {
                if(arr[i][j] != '0') {
                    if(arr[i-1][j] == '0' && arr[i+1][j] =='0' && arr[i][j-1] =='0' && arr[i][j+1] =='0'){
                        res[i][j] = ((int)(arr[i][j]-'A'))*16;
                    }else if(arr[i-1][j] != '0' && arr[i+1][j] =='0' && arr[i][j-1] =='0' && arr[i][j+1] =='0'){
                        res[i][j] = ((int)(arr[i][j]-'A'))*16+1;
                    }else if(arr[i-1][j] == '0' && arr[i+1][j] =='0' && arr[i][j-1] !='0' && arr[i][j+1] =='0'){
                        res[i][j] = ((int)(arr[i][j]-'A'))*16+2;
                    }else if(arr[i-1][j] != '0' && arr[i+1][j] =='0' && arr[i][j-1] !='0' && arr[i][j+1] =='0'){
                        res[i][j] = ((int)(arr[i][j]-'A'))*16+3;
                    }else if(arr[i-1][j] == '0' && arr[i+1][j] =='0' && arr[i][j-1] =='0' && arr[i][j+1] !='0'){
                        res[i][j] = ((int)(arr[i][j]-'A'))*16+4;
                    }else if(arr[i-1][j] != '0' && arr[i+1][j] =='0' && arr[i][j-1] =='0' && arr[i][j+1] !='0'){
                        res[i][j] = ((int)(arr[i][j]-'A'))*16+5;
                    }else if(arr[i-1][j] == '0' && arr[i+1][j] =='0' && arr[i][j-1] !='0' && arr[i][j+1] !='0'){
                        res[i][j] = ((int)(arr[i][j]-'A'))*16+6;
                    }else if(arr[i-1][j] != '0' && arr[i+1][j] =='0' && arr[i][j-1] !='0' && arr[i][j+1] !='0'){
                        res[i][j] = ((int)(arr[i][j]-'A'))*16+7;
                    }else if(arr[i-1][j] == '0' && arr[i+1][j] !='0' && arr[i][j-1] =='0' && arr[i][j+1] =='0'){
                        res[i][j] = ((int)(arr[i][j]-'A'))*16+8;
                    }else if(arr[i-1][j] != '0' && arr[i+1][j] !='0' && arr[i][j-1] =='0' && arr[i][j+1] =='0'){
                        res[i][j] = ((int)(arr[i][j]-'A'))*16+9;
                    }else if(arr[i-1][j] == '0' && arr[i+1][j] !='0' && arr[i][j-1] !='0' && arr[i][j+1] =='0'){
                        res[i][j] = ((int)(arr[i][j]-'A'))*16+10;
                    }else if(arr[i-1][j] != '0' && arr[i+1][j] !='0' && arr[i][j-1] !='0' && arr[i][j+1] =='0'){
                        res[i][j] = ((int)(arr[i][j]-'A'))*16+11;
                    }else if(arr[i-1][j] == '0' && arr[i+1][j] !='0' && arr[i][j-1] =='0' && arr[i][j+1] !='0'){
                        res[i][j] = ((int)(arr[i][j]-'A'))*16+12;
                    }else if(arr[i-1][j] != '0' && arr[i+1][j] !='0' && arr[i][j-1] =='0' && arr[i][j+1] !='0'){
                        res[i][j] = ((int)(arr[i][j]-'A'))*16+13;
                    }else if(arr[i-1][j] == '0' && arr[i+1][j] !='0' && arr[i][j-1] !='0' && arr[i][j+1] !='0'){
                        res[i][j] = ((int)(arr[i][j]-'A'))*16+14;
                    }else if(arr[i-1][j] != '0' && arr[i+1][j] !='0' && arr[i][j-1] !='0' && arr[i][j+1] !='0'){
                        res[i][j] = ((int)(arr[i][j]-'A'))*16+15;
                    }
                }else{
                    res[i][j]=-1;
                }
                if(String.valueOf(res[i][j]).length()>l){
                    l = String.valueOf(res[i][j]).length();
                }

            }
        }
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(l==3){
                    if(j==n){
                        System.out.format("%3d", res[i][j]);
                    }else{
                        System.out.format("%3d ", res[i][j]);
                    }
                }else if(l==2){
                    if(j==n){
                        System.out.format("%2d", res[i][j]);
                    }else{
                        System.out.format("%2d ", res[i][j]);
                    }
                }else if(l==1){
                    if(j==n){
                        System.out.format("%d", res[i][j]);
                    }else{
                        System.out.format("%d ", res[i][j]);
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        nhn2017test3 test = new nhn2017test3();
        try{
            test.input();
            test.solve();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
