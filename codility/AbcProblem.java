import java.io.CharArrayReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class AbcProblem {
    public static final int MAX_VALUE = 100001;

    public int solution(String[] colors) {

        HashMap<Character, Integer> count = new HashMap<>();
        int answer = 0;

        for (String color : colors) {
            char charArray[] =  color.toCharArray();

            if (charArray[0] == charArray[1] && charArray[1] == charArray[2]) {

            } else if (charArray[0] == charArray[1]) {
                char temp = charArray[2];
                charArray[2] = charArray[1];
                charArray[1] = temp;
            } else if (charArray[1] == charArray[2]) {
                char temp = charArray[1];
                charArray[1] = charArray[0];
                charArray[0] = temp;
            }

            if (count.get(charArray[0]) == null) {
                count.put(charArray[0], 0);
            }

            count.put(charArray[0], count.get(charArray[0]) + 1);

            answer = Math.max(answer, count.get(charArray[0]));
        }

        return answer;
    }

    public static void main(String[] args) {
        AbcProblem ap = new AbcProblem();

        String[] givenColors = {"aab", "cab", "baa", "baa"};

        System.out.println(ap.solution(givenColors));
    }
}
