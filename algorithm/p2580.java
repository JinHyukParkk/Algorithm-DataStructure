import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 19..
 */
public class p2580 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int arr[][] = new int[10][10];
    boolean check[];
    int count;
    void input() throws IOException{
        count = 0;
        for (int i = 0; i <9 ; i++) {
            String str[] = bufferedReader.readLine().split("\\s");
            for (int j = 0; j <9; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
                if(arr[i][j]==0) count++;
            }
        }
    }
    void solve(){
        while(count!=0){
            rowcheck();
            colcheck();
            squcheck();
        }
        System.out.println();
        printmap();
    }

    void printmap(){
        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j <9 ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    int checknum(boolean ch[]){
        int idx = 0;
        for (int i = 0; i <9 ; i++) {
            if(ch[i] == false)
                if(idx==0){
                    idx = 9;
                }else {
                    idx = i;
                }
        }

        return idx;
    }
    void rowcheck(){
        int idx_i;
        int idx_j;
        int c;
        for (int i = 0; i <9 ; i++) {
            idx_i = 0;
            idx_j = 0;
            c = 0;
            check = new boolean[10];
            for (int j = 0; j <9 ; j++) {
                if(arr[i][j]==0){
                    idx_i = i;
                    idx_j = j;
                    c++;
                }else{
                    check[arr[i][j]] = true;
                }
            }
            if(c==1){
                arr[idx_i][idx_j] = checknum(check);
                count--;
            }
        }
    }
    void colcheck(){
        int idx_i;
        int idx_j;
        int c;
        for (int i = 0; i <9 ; i++) {
            idx_i = 0;
            idx_j = 0;
            c = 0;
            check = new boolean[10];
            for (int j = 0; j <9 ; j++) {
                if(arr[j][i]==0){
                    idx_i = i;
                    idx_j = j;
                    c++;
                }else{
                    check[arr[j][i]] = true;
                }
            }
            if(c==1){
                arr[idx_j][idx_i] = checknum(check);
                count--;
            }
        }
    }
    void squcheck(){
        int idx_i;
        int idx_j;
        int c;
        for (int i = 0; i <9 ; i++) {
            idx_i = 0;
            idx_j = 0;
            c = 0;
            check = new boolean[10];
            for (int j = 0; j <9 ; j++) {
                if(arr[(3*(i/3)+j/3)][(3*(i%3)+j%3)] == 0){
                    idx_i = (3*(i/3)+j/3);
                    idx_j = (3*(i%3)+j%3);
                    c++;
                }else{
                    check[arr[(3*(i/3)+j/3)][(3*(i%3)+j%3)]] = true;
                }
            }
            if(c==1){
                arr[idx_i][idx_j] = checknum(check);
                count--;
            }
        }
    }
    public static void main(String[] args) {
        p2580 test = new p2580();
        try{
            test.input();
            test.solve();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
