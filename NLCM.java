/**
 * Created by jinhyuk on 2017. 9. 21..
 */
public class NLCM {

    // nlcm : 최대공약수(유클리드 호제법), 최소공배수
    public long nlcm(int[] num) {
        long g = num[0];
        long answer=1;
        for (int i = 1; i < num.length; i++) {
            long temp = g;
            g *= num[i];
            g /= gcd(temp,num[i]);
        }
        return g;
    }
    long gcd(long p, long q){
        if(q==0) return p;
        else return gcd(q,p%q);
    }

    public static void main(String[] args) {
        NLCM c = new NLCM();
        int[] ex = { 20,100,50};
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.nlcm(ex));
    }
}
