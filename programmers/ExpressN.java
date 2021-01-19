
import java.util.Arrays; //테스트로 출력해 보기 위한 코드입니다.

public class ExpressN {
    static int ans = -1;

    public static int solution(int n, int number) {
        recursion(n, number, 0, 0);
        return ans;
    }

    public static void recursion(int n, int number, int c, int a){
        if (c > 8) {
            ans = -1;
            return;
        }

        if (a == number) {
            ans = (ans == -1 || ans > c) ? c : ans;
            return;
        } 

        int ns = n;
        for (int i = 1; i < 9 - c; i++) {
            int afterC = c + i;
            recursion(n, number, afterC, a+ns);
            recursion(n, number, afterC, a-ns);
            recursion(n, number, afterC, a*ns);
            recursion(n, number, afterC, a/ns);
            ns = ns * 10 + n;
        }
    }
    
    public static void main(String[] args) {
        ExpressN e = new ExpressN();

        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(e.solution(2, 11));
    }

}