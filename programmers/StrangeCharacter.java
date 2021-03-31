public class StrangeCharacter {
    public String solution(String s) {
        String answer = "";
        
        String str[] = s.split("");
        String space = " ";
        int cnt = 0;
        
        for (int i = 0; i < str.length; i++){
            if (str[i].equals(space)){
               cnt = 0;
            } else {
               if (cnt % 2 == 0){
                  cnt++;
                  str[i] = str[i].toUpperCase();
               } else {
                   cnt++;
                   str[i] = str[i].toLowerCase();
               }
            }
            answer += str[i];
        }
        
        return answer;
    }
  
  
    public static void main(String[] args) {
        StrangeCharacter ss = new StrangeCharacter();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        String test[] = {"sun", "bed", "car"};
        String[] ans = ss.solution(test, 1);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
        
    }
}
