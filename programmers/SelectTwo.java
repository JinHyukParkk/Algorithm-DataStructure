import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SelectTwo {

    public static void main(String args[]) {
        SelectTwo st = new SelectTwo();

        int numbers[] = {2,1,3,4,1};

        System.out.println(st.solution(numbers));
    }


    public int[] solution(int[] numbers) {
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++ ) {
            for (int j = i + 1; j < numbers.length; j++) {
                int val = numbers[i] + numbers[j];
                if (al.indexOf(val) < 0) {
                    al.add(val);
                }
            }
        }

        Collections.sort(al);

        int[] ans = new int[al.size()];

        for (int i = 0; i < al.size(); i++ ) { 
            ans[i] = al.get(i);
        }

        return ans;
    }
}
