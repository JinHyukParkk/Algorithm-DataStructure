import java.util.Arrays;

public class smallestN {

    
    public int solution(int[] A) {
        int n = 1;

        Arrays.sort(A);

        for (int v : A) {
            if (v == n) {
                n++;
                continue;
            } else if (v < n) {
                continue;
            } else if (v > n) {
                break;
            }
        }

        return n;
    }
    public static void main(String[] args) {
        smallestN sn = new smallestN();
        int a[] = {1,2,3,4};
        
        System.out.println(sn.solution(a));
    }
}
