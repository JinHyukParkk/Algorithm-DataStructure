/**
 * Created by jinhyuk on 2021. 03. 01..
 */
import java.util.Arrays;

public class NewId {

    public String solution(String new_id){
        String answer = "";

        // 1단계
        new_id = new_id.toLowerCase();

        // 2단계
        for(int i = 0; i < new_id.length(); i++) {
            char ch = new_id.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                answer += String.valueOf(ch);
            } else if (ch >= '0' && ch <= '9') {
                answer += String.valueOf(ch);
            } else if (ch == '.' || ch == '-' || ch == '_') {
                answer += String.valueOf(ch);
            }
        }

        //3 단계
        int dot_cnt = 0;
        for(int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i) == '.') {
                int j = i + 1;
                String dot = ".";

                while (j != answer.length() && answer.charAt(j) == '.') {
                    dot += ".";
                    j++;
                }

                if (dot.length() > 1) {
                    answer = answer.replace(dot, ".");
                }
            }
        }

        // 4단계
        if (answer.charAt(0) == '.') {
            answer = answer.substring(1, answer.length());
        } else if (answer.charAt(answer.length() - 1) == '.') {
            answer = answer.substring(0, answer.length() - 1);
        }

        // 5단계
        if (answer.length() == 0) {
            answer += "a";
        }

        // 6단계
        if (answer.length() > 15) {
            answer = answer.substring(0, 15);
        }
        if (answer.charAt(answer.length()-1) == '.') {
            answer = answer.substring(0, answer.length() - 1);
        }

        // 7단계
        String last_string = String.valueOf(answer.charAt(answer.length() - 1));
        while (answer.length() < 3) {
            answer += last_string;
        }

        return answer;
    }
    public static void main(String[] args) {
        NewId ni = new NewId();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println((ni.solution("=.=")));
    }

}