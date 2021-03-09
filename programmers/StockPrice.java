public class StockPrice {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int cnt = 0;
            for (int j = i + 1; j < prices.length; j++) {
                cnt++;
                if (prices[i] > prices[j]) {
                    break;
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        StockPrice sp = new StockPrice();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        int[] test = {1, 2, 3, 2, 3};

        int[] result = sp.solution(test);
        for (int i = 0; i < result.length; i++ ){
            System.out.println(result[i]);
        }
    }
}
