/**
 * Created by jinhyuk on 2017. 9. 21..
 */
import java.util.Arrays; //테스트로 출력해 보기 위한 코드입니다.

public class BestSet {

    public int[] bestSet(int n, int s){
        int[] answer;
        int a = s/n;
        int mod= s%n;
        if(a == 0){
            answer = new int[]{-1};
        }else{
            answer = new int[n];
            for (int i = n-1; i >=0; i--) {
                answer[i] = a;
                if(mod-- > 0){
                    answer[i]++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        BestSet c = new BestSet();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(Arrays.toString(c.bestSet(3,13)));
    }

}