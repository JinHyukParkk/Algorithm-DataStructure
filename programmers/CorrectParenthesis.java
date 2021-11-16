import java.util.Stack;

public class CorrectParenthesis {
    public static void main(String[] args) {

        System.out.println(new CorrectParenthesis().solution("()()"));
    }

    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if ( stack.isEmpty()) {
                    answer = false;
                    break;
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            answer = false;
        }

        return answer;
    }
}
