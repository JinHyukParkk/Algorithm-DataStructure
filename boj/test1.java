import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by jinhyuk on 2017. 9. 16..
 */
public class test1 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    Queue<String> q = new LinkedList<>();
    String[] con;
    int rul1;
    int rul2;
    boolean check[] = new boolean[3];
    int res = 0;
    int n;

    void input() throws IOException{
        con = bufferedReader.readLine().split("");
        n = con.length;
        for (int i = 0; i <n ; i++) {
            if(con[i].equals("*")){
                if(rul1!=0){
                    check[0] = true;
                }
                if(rul2!=0) {
                    check[1] = true;
                }
                rul1++;
            }
            if(con[i].equals("#")){
                if(rul1!=0){
                    check[1] = true;
                }
                rul2++;
            }
            if(con[i].equals("1") && con[i+1].equals("0")){
                q.offer("10");
                i++;
            }else{
                q.offer(con[i]);
            }
        }
    }
    void cal(){
        while(!q.isEmpty()){
            int n = Integer.parseInt(q.poll());
            double sum = 0;
            if(!q.isEmpty()){
                if(q.peek().equals("S")){ sum += Math.pow(n,1); q.poll();}
                else if(q.peek().equals("D")){ sum += Math.pow(n,2); q.poll();}
                else{ sum += Math.pow(n,3); q.poll();}
            }
            if(!q.isEmpty()){
                if(q.peek().equals("*")){
                    sum *= 2;
                    if(check[0]){
                        sum *=2;
                        check[0] = false;
                    }
                    q.poll();
                } else if(q.peek().equals("#")){
                    sum *= -1;
                    if(check[1]){
                        sum *=2;
                        check[1] = false;
                    }
                    q.poll();
                }
            }
            res += sum;
        }
        System.out.println((int)res);
    }
    public static void main(String[] args) {
        test1 test1 = new test1();
        try{
            test1.input();
            test1.cal();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
