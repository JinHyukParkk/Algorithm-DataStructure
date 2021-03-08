import java.util.Arrays;

public class Knumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            // 원래 소스
            // int gap = commands[i][1] - commands[i][0] + 1;
            // int[] sortArray = new int[gap];
            
            // for (int j = 0; j < gap; j++) {
            //     sortArray[j] = array[commands[i][0] + j - 1];
            // }

            int[] sortArray = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            
            Arrays.sort(sortArray);

            answer[i] = sortArray[commands[i][2] - 1];

        }

        return answer;
    }

    public static void main(String[] args) {
        Knumber kn = new Knumber();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        int[] test = {1, 5, 2, 6, 3, 7, 4};
        int[][] test1 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] result = kn.solution(test, test1);
        for (int i = 0; i < result.length; i++ ){
            System.out.println(result[i]);
        }
        
        
    }
}
