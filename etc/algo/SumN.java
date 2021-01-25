public class SumN {
    public static int ans = -1;
    public static int[] arr;
    
    public int solution(int[] N, int K) {
        arr = N;
        recursion(-1, K, 0);
        return ans;
    }

    public void recursion(int p, int k, int s) {
        if (k == 0) {
            if (s%2 == 0) {
                ans = Math.max(ans, s);
            }
        } else {
            for (int i = p + 1; i < arr.length; i++) {
                recursion(i, k-1, s + arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        SumN sn = new SumN();
        
        // int N[] = {4, 9, 8, 2, 6};
        // int K = 3;

        // int N[] = {5,6,3,4,2};
        // int K = 5;

        // int N[] = {7,7,7,7,7};
        // int K = 1;

        int N[] = {2, 3, 3, 5, 5,};
        int K = 3;
        System.out.println(sn.solution(N, K));
    }
}
