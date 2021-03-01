/**
 * Created by jinhyuk on 2021. 03. 01..
 */
import java.util.ArrayList;
import java.util.Arrays;

public class MockExam {

    public int[] solution(int[] answers){
        int[] sopo1 = {1, 2, 3, 4, 5};
        int[] sopo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] sopo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] sopo_answer_cnt = new int[4];

        for (int i = 0; i < answers.length; i++) {
            int ans_num = answers[i];

            if (ans_num == sopo1[i%5]) {
                sopo_answer_cnt[1]++;
            }

            if (ans_num == sopo2[i%8]) {
                sopo_answer_cnt[2]++;
            }

            if (ans_num == sopo3[i%10]) {
                sopo_answer_cnt[3]++;
            }
        }

        ArrayList<Integer> al = new ArrayList<Integer>();
        int max = Math.max(Math.max(sopo_answer_cnt[1], sopo_answer_cnt[2]), sopo_answer_cnt[3]);

        for (int i = 1; i <= 3; i++) {
            if (max == sopo_answer_cnt[i]) { 
                al.add(i);
            }
        }

        int answer[] = new int[al.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = al.get(i);
        }

        return answer;
    }
    public static void main(String[] args) {
        MockExam me = new MockExam();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        int[] test = {1,3,2,4,2};
        for (int val : me.solution(test)) {
            System.out.println(val);
        }
        
    }

}