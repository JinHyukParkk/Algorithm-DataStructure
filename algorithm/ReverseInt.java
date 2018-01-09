import java.util.Arrays;

/**
 * Created by jinhyuk on 2017. 9. 20..
 */
public class ReverseInt {
    public int reverseInt(int n){
        String s = String.valueOf(n);
        StringBuilder stringBuilder = new StringBuilder("");
        int a[] = new int[s.length()];
        for (int i = 0; i <s.length(); i++) {
            a[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        Arrays.sort(a);
        for (int i = 0; i <a.length ; i++) {
            stringBuilder.append(a[a.length-1-i]);
        }
        return Integer.parseInt(stringBuilder.toString());
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        ReverseInt ri = new ReverseInt();
        System.out.println(ri.reverseInt(118372));
    }
}
