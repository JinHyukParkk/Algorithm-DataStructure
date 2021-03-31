public class OddDigit {
    public int solution(int n) {
		int sum = 0;

		while(n != 0) {
			sum += n % 10;
			n /= 10;
		}
		
		return sum;
	}
  
  
    public static void main(String[] args) {
        OddDigit ss = new OddDigit();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(ss.solution(123));
        
    }
}
