/**
 * Created by jinhyuk on 2017. 9. 20..
 */
public class HarshadNumber{
    public boolean isHarshad(int num){
        int sum =0;
        int mem = num;
        while(num!=0){
            sum+= num%10;
            num/=10;
        }
        return (mem%sum==0)?true:false;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        HarshadNumber sn = new HarshadNumber();
        System.out.println(sn.isHarshad(18));
    }
}
