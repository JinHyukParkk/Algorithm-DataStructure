import java.util.Arrays;
import java.util.Comparator;

public class SortString {
    public String[] solution(String[] strings, int n) {
        
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                char c1 = s1.charAt(n);
                char c2 = s2.charAt(n);

                if (c1 == c2) {
                    return s1.compareTo(s2);
                } else {
                    return c1 - c2;
                }
            }
        });
        return strings;
    }

    public static void main(String[] args) {
        SortString ss = new SortString();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        String test[] = {"sun", "bed", "car"};
        String[] ans = ss.solution(test, 1);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
        
    }
}
