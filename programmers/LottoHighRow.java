public class LottoHighRow {

    public int[] solution(int[] lottos, int[] win_nums) {
        // 작성한 로또 : lottos      array[6] 1 2 3 4 0 0  
        // 당첨 로또 번호 : win_nums  array[6] 3 2 1 5 4 6   => [1, 2]

        int zeroCount = 0;
        int sameNumberCount = 0;

        // 0의 개수, 일치하는 번호 개수 구하는 로직
        for (int lotto : lottos) {
            // 0일 경우
            if (lotto == 0) {
                zeroCount++;
                continue;
            }

            for (int winNum : win_nums) {
                if (lotto == winNum) {
                    sameNumberCount++;
                    break;
                }
            }
        }

        // 최고, 최저 일치하는 숫자
        int highRankCount = sameNumberCount + zeroCount;
        int rowRankCount = sameNumberCount;

        // 등수 계산 : 1등 - 6개, 2등 - 5개, 3등 - 4개 ... 4-3, 5-2, 6 - 1,0  (7 - [일치하는 숫자] = 등수)
    
        // 등수 배열 값
        // 0일 경우 예외 처리 
        int[] answer = {7 - Math.max(highRankCount, 1), 7 - Math.max(rowRankCount, 1)};
        
        return answer;
    }
 
    public static void main(String[] args) {
        int[] givenLottos = {0, 0, 0, 0, 0, 0};
        int[] givenWinNums = {31, 10, 45, 1, 6, 19};

        LottoHighRow lottoHighRow = new LottoHighRow();
        int[] result = lottoHighRow.solution(givenLottos, givenWinNums);

        for (int a : result) {
            System.out.println(a);
        }
    }


    /**
     * 0의 개수 (A)
     * 
     * 일치하는 번호 수 (B)
     * 
     * 당첨 최고, 최저 식 = (C)
     * - 높을 때 : B + A
     * - 낮을 때 : B
     * 
     * 등수
     * 7 - C
     */
}



a (input) --> [ 알고리즘 ] --> b(output)

2600원 

500원 
100원
50원

최소 동전 개수 구하기 
