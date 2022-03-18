public class StringCompression {

    public int solution(String s) {
        int answer = s.length();

        for(int i = 1; i <= s.length() / 2 + 1; i++) {
            String prev = s.substring(0, i);
            int sameCount = 1;
            String last = "";
            String updateString = "";
            
            for(int j = i; j < s.length(); j += i) {
                if (j + i > s.length()) {
                    last = s.substring(j);
                    continue;
                }

                if (prev.equals(s.substring(j, j+i))) {
                    sameCount++;
                } else {
                    updateString += prev;
                    if (sameCount > 1) {
                        updateString = sameCount + updateString;
                    }

                    prev = s.substring(j, j+i);
                    sameCount = 1;
                }
            }

            updateString += prev + last;
            if (sameCount > 1) {
                updateString = sameCount + updateString;
            }

            answer = Math.min(answer, updateString.length());
        }

        return answer;
    }

    public static void main(String[] args) {
        StringCompression stringCompression = new StringCompression();

        String givenString = "aabbaccc";
        System.out.println(stringCompression.solution(givenString));

        givenString = "ababcdcdababcdcd";
        System.out.println(stringCompression.solution(givenString));

        givenString = "abcabcdede";
        System.out.println(stringCompression.solution(givenString));

        givenString = "abcabcabcabcdededededede";  // 2abcabc2dedede
        System.out.println(stringCompression.solution(givenString));

        givenString = "xababcdcdababcdcd";
        System.out.println(stringCompression.solution(givenString));
    }
}


/**
 * s/2 까지가 최대 압축할 수 있는 문자열
 * 
 * - 1 ~ s/2 까지의 압축할 수 있는 수를 구함
 * - 구할 때마다 최소값 구해줌
 */