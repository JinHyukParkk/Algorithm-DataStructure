import javax.print.attribute.standard.MediaSize.NA;

public class NumberString {
    public int solution(String s) {
        int answer = 0;
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for(int i = 0; i < str.length; i++){
            s = s.replace(str[i], num[i]);
        }
        answer = Integer.parseInt(s);
        
        return answer;
    }

    public static void main(String[] args) {
        NumberString numberString = new NumberString();

        String givenS = "one4seveneight";
        System.out.println(numberString.solution(givenS));

        String givenS1 = "23four5six7";
        System.out.println(numberString.solution(givenS1));

        String givenS2 = "2three45sixseven";
        System.out.println(numberString.solution(givenS2));

        String givenS3 = "123";
        System.out.println(numberString.solution(givenS3));
    }
}
