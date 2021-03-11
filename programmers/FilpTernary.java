public class FilpTernary {
    public int solution(int n) {
        // 뒤집어도 이 계산법이 됨.
        int threeNum = 0;

        while(n > 2) {
            threeNum = (threeNum + (n % 3)) * 3;
            n /= 3;
        }

        return threeNum + n;
    }

    public static void main(String[] args) {
        FilpTernary ft = new FilpTernary();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(ft.solution(125));
    }
}
