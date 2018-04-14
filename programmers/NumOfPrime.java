/**
 * Created by jinhyuk on 2017. 9. 20..
 */
public class NumOfPrime {
    int numberOfPrime(int n) {
        int result = 0;
        // 함수를 완성하세요.
        boolean is = true;
        for (int i = 2; i <=n ; i++) {
            is = true;
            for (int j = 2; j*j <=i ; j++) {
                if(i%j==0){
                    is = false;
                }
            }
            if(is)  result++;
        }
        return result;
    }

    public static void main(String[] args) {
        NumOfPrime prime = new NumOfPrime();
        System.out.println( prime.numberOfPrime(10) );
    }

}