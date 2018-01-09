import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by jinhyuk on 2017. 10. 28..
 */
public class p1931 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    int n;
    ArrayList<ConfiTime> arrayList = new ArrayList<ConfiTime>();
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
        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());
            arrayList.add(new ConfiTime(x,y));
        }
    }
    void sovle(){
        int count = 0;
        int endTime = -1;
        Collections.sort(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).start>=endTime){
                count++;
                endTime = arrayList.get(i).end;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        new p1931().start();
    }
}
class ConfiTime implements Comparable<ConfiTime>{
    int start;
    int end;
    ConfiTime(int start, int end){
        this.start = start;
        this.end = end;
    }
    @Override
    public int compareTo(ConfiTime o) {
        if (this.end < o.end) {
            return -1;
        } else if (this.end > o.end) {
            return 1;
        }
        return this.end <= o.start ? -1 : 1;
    }
}

