/**
 * Created by jinhyuk on 2017. 9. 8..
 */
import java.util.Arrays;

class TryHelloWorld {
    public int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];
        int gcd = a*b;
        int n;
        while(a%b!=0){
            n =a;
            a = b;
            b = n%b;
        }
        answer[0] = b;
        answer[1] = gcd/b;
        return answer;
    }

    public int getMinSum(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        int answer = 0;
        for (int i = 0; i < A.length; i++) {
            answer+=A[i]*B[B.length-i-1];
        }

        return answer;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        TryHelloWorld c = new TryHelloWorld();
        System.out.println(Arrays.toString(c.gcdlcm(3, 12)));

        TryHelloWorld test = new TryHelloWorld();
        int []A = {1,2};
        int []B = {3,4};
        System.out.println(test.getMinSum(A, B));
    }
}

