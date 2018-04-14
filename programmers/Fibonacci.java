/**
 * Created by jinhyuk on 2017. 9. 8..
 */
class Fibonacci {
    public long fibonacci(int num) {
        long answer = 0;
        long arr[] = new long[num+1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < num+1; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        answer = arr[num];
        return answer;

    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Fibonacci c = new Fibonacci();
        int testCase = 3;
        System.out.println(c.fibonacci(testCase));
    }
}
