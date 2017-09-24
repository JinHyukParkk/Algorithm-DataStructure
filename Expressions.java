/**
 * Created by jinhyuk on 2017. 9. 21..
 */
public class Expressions {
    // 연속되는 숫자 합의 개수 찾기 - 반복+재귀
    public int expressions(int num) {
        int answer = 1;
        for (int i = 1; i <=num/2; i++) {
            answer+=sum(i,i+1,num);
        }
        return answer;
    }
    int sum(int n, int p,int d){
        if(n==d) return 1;
        else if(n>d) return 0;
        else return sum(n+p,p+1,d);
    }

    public static void main(String args[]) {
        Expressions expressions = new Expressions();
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(expressions.expressions(15));
    }
}