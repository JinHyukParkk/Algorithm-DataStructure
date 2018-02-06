/**
 * Created by jinhyuk on 2017. 9. 21..
 */
public class JumpCase {

    // 1칸,2칸 멀리 뛰기 개수 : 피보나치 수열
    public int jumpCase(int num) {
        int answer = 0;
        int arr[] = new int[num+1];
        arr[0] =1;
        arr[1] =1;
        for (int i = 2; i <=num ; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[num];
    }

    public static void main(String[] args) {
        JumpCase c = new JumpCase();
        int testCase = 4;
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.jumpCase(testCase));
    }
}
