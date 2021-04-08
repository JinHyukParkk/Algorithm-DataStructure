import java.util.Arrays;

public class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            sum += d[i];
            if (sum > budget) {
                answer = i;
                break;
            }
        }
  
        return sum <= budget ? d.length : answer;
    }
    public static void main(String[] args) {
        Budget b = new Budget();
        
    }
}
