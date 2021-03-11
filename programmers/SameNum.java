import java.util.ArrayList;
import java.util.List;

public class SameNum {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();

        int tmp = arr[0];
        answer.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (tmp != arr[i]) {
                tmp = arr[i];
                answer.add(arr[i]);
            }
        }

        int[] ans = answer.stream().mapToInt(i -> i).toArray();

        return ans;
    }

    public static void main(String[] args) {
        SameNum sn = new SameNum();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        int[] test = {4,4,4,3,3};
        int[] ans = sn.solution(test);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
        
    }
}
