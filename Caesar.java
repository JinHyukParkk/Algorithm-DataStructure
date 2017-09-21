/**
 * Created by jinhyuk on 2017. 9. 21..
 */
public class Caesar {
    String caesar(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder("");
        n%=26;
        for (int i = 0; i < s.length() ; i++) {
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)){
                ch = (char) ((ch-'a'+n)%26+'a');
            }else if(Character.isUpperCase(ch)){
                ch = (char) ((ch-'A'+n)%26+'A');
            }
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Caesar c = new Caesar();
        System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 4));
    }
}

