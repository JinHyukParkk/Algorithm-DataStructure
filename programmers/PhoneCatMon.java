import java.util.ArrayList;

public class PhoneCatMon {
    public int solution(int[] nums) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(nums[0]);
        for(int i = 1; i < nums.length; i++) {
            if(!al.contains(nums[i])) {
                al.add(nums[i]);
            }
        }

        return Math.min(nums.length/2, al.size());
    }

    public static void main(String[] args) {
        PhoneCatMon pcm = new PhoneCatMon();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        int test[] = {3,3,3,2,2,4};
        int ans = pcm.solution(test);
        System.out.println(ans);
       
    }
}

