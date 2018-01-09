/**
 * Created by jinhyuk on 2017. 9. 20..
 */
public class Collatz {
    public int collatz(int num) {
        int answer = 0;
        while(answer<500){
            answer++;
            if(num%2==0){
                num/=2;
            }else{
                num*=3;
                num+=1;
            }
            if(num==1) return answer;
        }
        answer = -1;

        return answer;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Collatz c = new Collatz();
        int ex = 6;
        System.out.println(c.collatz(ex));
    }
}