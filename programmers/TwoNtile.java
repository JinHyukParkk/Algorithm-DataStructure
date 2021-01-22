
public class TwoNtile {
    public int solution(int n) {
        int answer = 0;

        int dp[] = new int[n+1];

        dp[0] = 1;
        dp[1] = 2;

        for (int i = 2; i < n; i++ ){
            dp[i] = dp[i-2] + dp[i-1];
            dp[i] %= 1000000007;
        }

        return dp[n-1];
    }
    
    public static void main(String[] args) {
        TwoNtile t = new TwoNtile();

        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(t.solution(4));
    
    }
}