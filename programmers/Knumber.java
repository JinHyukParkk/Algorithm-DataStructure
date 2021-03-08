public class Knumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};

        for (int i = 0; i < commands.length; i++) {
            
        }
        return answer;
    }

    public static void main(String[] args) {
        Knumber kn = new Knumber();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        int[] test = {1, 5, 2, 6, 3, 7, 4};
        int[][] test1 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(kn.solution(test, test1));
        
    }
}
