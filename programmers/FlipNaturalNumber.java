

public class FlipNaturalNumber {
    public int[] solution(long n) {
        String tempStr = Long.toString(n);
        char[] tempChar = tempStr.toCharArray();
        int len = tempChar.length;
        int[] answer = new int[len];

        for(int i =0; i < len; i++){
            answer[i] = Integer.parseInt(Character.toString(tempChar[len - 1 - i]));
        }
        return answer;
    }


    public static void main(String[] args) {
        FlipNaturalNumber ss = new FlipNaturalNumber();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(ss.solution(123));
        
    }
}