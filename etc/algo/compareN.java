import java.util.Arrays;

public class compareN {
    public static final int MAX_VALUE = 100001;
  
    public int solution(int[] A, int[] B) {
        int ans = MAX_VALUE;
        int size = A.length;
        int C[] = new int[size];

        for (int i = 0; i < size; i++) {
            if (A[i] != B[i]) {
                C[i] = Math.max(A[i], B[i]);
                ans = Math.min(ans, Math.min(A[i], B[i]));
            }
            C[i] = A[i];
        }

        for( int v : C) {
            System.out.println(v);
        }

        ans = solution1(C);

        return ans;

    }

    public int solution1(int[] A) {
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
        compareN cn = new compareN();

        // int A[] = {1,2,4,3};
        // int B[] = {1,3,2,3};

        int A[] = {3,2,1,6,5};
        int B[] = {4,2,1,3,3};

        // int A[] = {1, 2};
        // int B[] = {1, 2};
        System.out.println(cn.solution(A, B));
    }
}
