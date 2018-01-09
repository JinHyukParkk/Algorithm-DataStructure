import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 3..
 */
public class p5430 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private String arr[];
    private int deq[];
    StringBuilder stringBuilder = new StringBuilder();
    void input() throws IOException{
        int tc = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < tc ; i++) {
            String f = bufferedReader.readLine();
            int n = Integer.parseInt(bufferedReader.readLine());
            deq = new int[n];
            arr = bufferedReader.readLine().replaceAll("[\\[\\]]","").split(",");
            for (int j = 0; j < n; j++) {
                deq[j] = Integer.parseInt(arr[j]);
            }
            start_f(f);
        }
    }
    boolean del(int p){
        try{
            deq[p] = 0;
        }catch (Exception e){
            return false;
        }
        return true;
    }
    void start_f(String f){
        int front = 0, rear = arr.length-1, ptr = front;
        for (int i = 0; i < f.length(); i++) {
            if(f.charAt(i) == 'R'){
                if(ptr == front) ptr = rear;
                else ptr = front;
            }else{
                if(!del(ptr)) {
                    stringBuilder.append("error\n");
                    return;
                }else if(ptr == front) ptr = ++front;
                else ptr = --rear;

            }
        }
        stringBuilder.append("[");
        if(rear-front<0){
            stringBuilder.append("]\n");
        } else if(ptr == front){
            for (int i = front; i < rear; i++) {
                stringBuilder.append(arr[i] + ",");
            }
            stringBuilder.append(arr[rear] + "]\n");
        }else{
            for (int i = rear; i > front; i--) {
                stringBuilder.append(arr[i] + ",");
            }
            stringBuilder.append(arr[front] + "]\n");
        }

    }
    public static void main(String[] args) {
        p5430 test = new p5430();
        try{
            test.input();
            test.bufferedReader.close();
            System.out.println(test.stringBuilder.toString());
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
