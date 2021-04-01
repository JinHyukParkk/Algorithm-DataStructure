import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;

public class UniqueNumbers {
    public static Collection<Integer> findUniqueNumbers(Collection<Integer> numbers) {
        ArrayList<Integer> list = new ArrayList<>(numbers);
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> dupl = new ArrayList<>();
        
        while(list.size() != 0) {
            int temp = list.get(0);
            list.remove(0);

            if (!(list.contains(temp) || dupl.contains(temp))) {
                answer.add(temp);
            } else {
                dupl.add(temp);
            }
        }
            
        return answer;
    }


    public static void main(String[] args) {
        Collection<Integer> numbers = Arrays.asList(1, 2, 1, 3);
        for (int number : findUniqueNumbers(numbers))
            System.out.println(number);
    }
}