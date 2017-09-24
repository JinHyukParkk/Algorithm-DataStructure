/**
 * Created by jinhyuk on 2017. 9. 22..
 */
public class FindLargestSquare {
    // 가장 큰 정사각현 만들기  디피 문제
    public int findLargestSquare(char [][]board)
    {
        int dp[][] = new int[board.length+1][board[0].length+1];
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <board.length+1 ; i++) {
            for (int j = 1; j <board[0].length+1 ; j++) {
                if(board[i-1][j-1] == 'O'){
                    dp[i][j] = Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1;
                    max = max<dp[i][j]?dp[i][j]:max;
                }

            }
        }
        return max*max;
    }
    public static void main(String[] args)
    {
        FindLargestSquare test = new FindLargestSquare();
        char[][] board ={
                {'X','O','O','O','X'},
                {'X','O','O','O','O'},
                {'X','X','O','O','O'},
                {'X','X','O','O','O'},
                {'X','X','X','X','X'}};

        System.out.println(test.findLargestSquare(board));
    }
}
