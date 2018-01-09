import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 10. 24..
 */
public class p1289 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    int n;
    long sum;
    final long mod = 1000000007;
    ArrayList<Node>[] arrayList;

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
        arrayList = new ArrayList[n+1];
        for (int i = 0; i < n+1; i++) {
            arrayList[i] = new ArrayList<Node>();
        }
        for (int i = 0; i < n-1; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());
            int z = Integer.parseInt(stringTokenizer.nextToken());
            arrayList[x].add(new Node(y,z));
            arrayList[y].add(new Node(x,z));
        }
    }
    void sovle(){
        sum = 0;
        findPath(1,-1);
        System.out.println(sum);
    }

    long findPath(int sta, int des){
        long s = 1;
        long t = 0;
        for(Node node : arrayList[sta]){
            if(node.next == des) {continue;}
            t = findPath(node.next, sta) * node.price % mod;
            sum = (sum + t*s) % mod;
            s = (s + t) % mod;
        }
        return s;
    }

    public static void main(String[] args) {
        new p1289().start();
    }
}
class Node{
    int next;
    int price;
    Node(int des,int price){
        this.next = des;
        this.price = price;
    }
}