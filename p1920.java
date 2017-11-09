import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 11. 8..
 */
public class p1920 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter printWriter = new PrintWriter(new BufferedOutputStream(System.out));
    StringTokenizer stringTokenizer;
    StringBuilder stringBuilder = new StringBuilder("");

    int n,m;
    ArrayList<Integer> arr = new ArrayList<Integer>();
    ArrayList<Integer> search = new ArrayList<Integer>();
    void start(){
        try{
            input();
            solve();
            printWriter.print(stringBuilder.toString());
            printWriter.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(stringTokenizer.nextToken()));
        }
        Collections.sort(arr);
        m = Integer.parseInt(bufferedReader.readLine());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < m; i++) {
            search.add(Integer.parseInt(stringTokenizer.nextToken()));
        }
    }
    void solve(){
        for (int i = 0; i < search.size(); i++) {
            stringBuilder.append(twosearch(0,n-1,search.get(i))+"\n");
        }
    }
    int twosearch(int left, int right, int searchNum){
        int mid = (left+right)/2;
        if(left>right) return 0;
        else{
            if(arr.get(mid) > searchNum){
                return twosearch(left,mid-1,searchNum);
            }else if(arr.get(mid) < searchNum){
                return twosearch(mid+1,right,searchNum);
            }else{
                return 1;
            }
        }
    }

    public static void main(String[] args) {
        new p1920().start();
    }
}
