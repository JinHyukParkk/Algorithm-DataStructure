import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 10. 2..
 */
public class p1991 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokernizer;
    int n;
    int arr[][] = new int[26][2];
    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            stringTokernizer = new StringTokenizer(bufferedReader.readLine());
            int x = stringTokernizer.nextToken().charAt(0) - 'A';
            char r = stringTokernizer.nextToken().charAt(0);
            if(r == '.'){
                arr[x][0] = -1;
            }else {
                arr[x][0] = r - 'A';
            }
            char l = stringTokernizer.nextToken().charAt(0);
            if(l == '.'){
                arr[x][1] = -1;
            }else {
                arr[x][1] = l - 'A';
            }
        }
    }
    void solve(){
        preorder(0);
        System.out.println();
        inorder(0);
        System.out.println();
        postorder(0);
    }
    void preorder(int x){
        if(x == -1) return;
        System.out.print((char)(x + 'A'));
        preorder(arr[x][0]);
        preorder(arr[x][1]);
    }
    void inorder(int x){
        if(x == -1) return;
        inorder(arr[x][0]);
        System.out.print((char)(x + 'A'));
        inorder(arr[x][1]);
    }
    void postorder(int x){
        if(x == -1) return;
        postorder(arr[x][0]);
        postorder(arr[x][1]);
        System.out.print((char)(x + 'A'));
    }
    public static void main(String[] args) {
        p1991 test = new p1991();
        try{
            test.input();
            test.solve();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
