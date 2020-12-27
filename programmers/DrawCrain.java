import java.util.Stack;

public class DrawCrain {
    public static void main(String args[]) {
        DrawCrain dc = new DrawCrain();

        int board[][] = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int moves[] = {1,5,3,5,1,2,1,4};

        System.out.println(dc.solution(board, moves));
    }

    public int solution(int[][] board, int[] moves) {
        Stack<Integer> s = new Stack<>();
        int size = board.length;
        int pivot[] = new int[size];
        
        int returnValue, addValue = 0;
        int ans = 0;
        
        // 높이 설정 
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[j][i] != 0) {
                    pivot[i] = j;
                    break;
                }
            }
        }

        for (int i : moves) {
            int j = i - 1;
            // 열은 비워 있음
            if (pivot[j] == size) {
                continue;
            }

            // 추가 될 값
            addValue = board[pivot[j]][j];
            pivot[j]++;

            // 아무 것도 없을 때 
            if (s.isEmpty()) {
                s.push(addValue);
                continue;
            }
            
            returnValue = s.peek();
            if (addValue == returnValue) {
                s.pop();
                ans++;
            } else {
                s.push(addValue);
            }
        }

        return ans*2;
    }

    public int solution1(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(int m : moves) {
            for(int i=0; i<board.length; ++i) {
                if(board[i][m-1] == 0) continue;

                if(!stack.isEmpty() && stack.peek() == board[i][m-1]) {
                    stack.pop();
                    answer += 2;
                } else {
                    stack.push(board[i][m-1]);
                }

                board[i][m-1] = 0;
                break;
            }
        }

        return answer;
    }
}
