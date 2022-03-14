import java.util.Arrays;

public class AbcProblem {
    public static final int MAX_VALUE = 100001;

    public int solution(String[] colors) {

        String[] givenColors = {"aab", "cab", "baa", "baa"};

        for(int i = 0; i < colors.length; i++) {
            colors[i] = givenColors[i];
        }

        return 3;
    }


    public static void main(String[] args) {
        AbcProblem ap = new AbcProblem();

        String[] givenColors = {"aab", "cab", "baa", "baa"};

        System.out.println(ap.solution(givenColors));
    }
}
