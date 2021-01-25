public class removeString {
    public int solution(String S, int[] C) {
        // init 
        char p = S.charAt(0);
        int pi = 0;
        int ans = 0;

        for (int i = 1; i < S.length(); i++) {
            if(p == S.charAt(i)) {
                ans += Math.min(C[pi], C[i]);
                pi++;
                continue;
            }
            p = S.charAt(i);
            pi++;
        }

        return ans;
    }
    public static void main(String[] args) {
        removeString rs = new removeString();
        // String S = "abccbd";
        // int[] C = {0,1,2,3,4,5};
        // String S = "aabbcc";
        // int[] C = {1, 2, 1, 2, 1, 2};
        // String S = "aaaa";
        // int[] C = {3, 4, 5, 6};
        // String S = "ababa";
        // int[] C = {10, 5, 10, 5, 10};
        String S = "aaaa";
        int[] C = {3, 4, 5, 6};

        System.out.println(rs.solution(S, C));
    }
}
