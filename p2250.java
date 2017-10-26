import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 10. 24..
 */
public class p2250 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    int n;
    int pos= 1;
    Node node[];
    int real[];
    int max[];
    int min[];
    void start(){
        try{
            input();
            sovle();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    void input() throws IOException{
        n = Integer.parseInt(bufferedReader.readLine().replaceAll(" ",""));
        node = new Node[n+1];
        real = new int[n+1];
        max = new int[n+1];
        min = new int[n+1];
        int x,y,z;
        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            x = Integer.parseInt(stringTokenizer.nextToken());
           y = Integer.parseInt(stringTokenizer.nextToken());
            z = Integer.parseInt(stringTokenizer.nextToken());
            node[x] = new Node(y,z,0,0);
            real[x]++;
            if(y != -1) real[y]++;
            if(z != -1) real[z]++;
        }
    }
    void sovle(){
        int target = 0;
        for (int i = 1; i <= n; i++) {
            if(real[i] == 1) target = i;
        }
        dfs(target,1);
        long ans =0;
        long ans_i=1;
        for (int i = 0; i <=n; i++) {
            long cal = max[i]-min[i]+1;
            if(ans<cal){ ans = cal; ans_i= i;}
        }
        System.out.println(ans_i + " " + ans);
    }
    void dfs(int now, int level){
        if(node[now].left>0) dfs(node[now].left,level+1);
        node[now].level = level;
        node[now].point = pos;
        if(min[node[now].level]==0) min[node[now].level] = Integer.MAX_VALUE;
        if(min[node[now].level] > node[now].point) min[node[now].level] = node[now].point;
        if(max[node[now].level] < node[now].point) max[node[now].level] = node[now].point;
        pos++;
        if(node[now].right>0) dfs(node[now].right,level+1);
    }

    public static void main(String[] args) {
        new p2250().start();
    }
}
class Node{
    int left;
    int right;
    int point;
    int level;
    Node(int left, int right, int point, int level){
        this.left = left;
        this.right = right;
        this.point = point;
        this.level = level;
    }
}

