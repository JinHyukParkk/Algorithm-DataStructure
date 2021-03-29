public class DotProduct {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++ ){
            answer += a[i] * b[i];
        }
        return answer;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        DotProduct o = new DotProduct();
        int a[] = {1,2,3,4};
        int b[] = {-3,-2,0,1};
        System.out.println(o.solution(a,b));
    }
}
