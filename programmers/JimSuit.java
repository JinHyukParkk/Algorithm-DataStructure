/**
 * Created by jinhyuk on 2021. 03. 03..
 */
import java.util.Arrays;
import java.util.stream.IntStream;

public class JimSuit {

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] student = new int[n];

        for (int i = 0; i < lost.length; i++) {
            student[lost[i] - 1]--;
        }

        for (int i = 0; i < reserve.length; i++) {
            student[reserve[i] - 1]++;
        }

        for (int i = 0; i < student.length; i++) {
            if (student[i] < 0) {
                if (i != student.length - 1 && student[i+1] > 0) {
                    student[i+1]--;
                    student[i]++;
                } else if (i != 0 && student[i-1] > 0) {
                    student[i-1]--;
                    student[i]++;
                }
            }
        }

        for (int i = 0; i < student.length; i++) {
            if (student[i] >= 0) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        JimSuit js = new JimSuit();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        int[] test = {1,5};
        int[] test1 = {2, 4};
        System.out.println(js.solution(5, test, test1));
        
    }

}