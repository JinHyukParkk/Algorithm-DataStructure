/**
 * Created by jinhyuk on 2017. 9. 21..
 */
public class Hopscotch {
    //디피문제
    int hopscotch(int[][] board, int size) {
        int dp[][] = new int[board.length][board[0].length];
        int max;
        for (int i = 0; i < board[0].length; i++) {
            dp[0][i] = board[0][i];
        }
        for (int i = 1; i <board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                max = Integer.MIN_VALUE;
                for (int k = 0; k < board[0].length; k++) {
                    if(j!=k && dp[i-1][k]>max) max = dp[i-1][k];
                }
                dp[i][j] = max+board[i][j];
            }
        }
        int result = Integer.MIN_VALUE;
        for (int i = 0; i <board[0].length ; i++) {
            if(result <dp[board.length-1][i]){
                result = dp[board.length-1][i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Hopscotch c = new Hopscotch();
        int[][] test = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.hopscotch(test, 3));
    }

}
