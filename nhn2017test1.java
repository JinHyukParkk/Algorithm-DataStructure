import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class nhn2017test1 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String s[];
    Queue<Integer> queue = new LinkedList<Integer>();
    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    void input() throws IOException {
        s = bufferedReader.readLine().split(" ");
    }

    void solve() {
        int temp;
        for (int i = 0; i < s.length; i++) {
            temp = Integer.parseInt(s[i]);
            if (queue.size() == 3) {
                if (queue.contains(temp)) {
                    queue.remove(temp);
                    queue.add(temp);
                } else {
                    arrayList.add(queue.poll());
                    queue.add(temp);
                }
            }else{
                queue.add(temp);
            }
        }
        if(arrayList.isEmpty()){
            System.out.println("0");
        }else{
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.println(arrayList.get(i));
            }
        }


    }

    public static void main(String[] args) {
        nhn2017test1 test = new nhn2017test1();
        try {
            test.input();
            test.solve();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}