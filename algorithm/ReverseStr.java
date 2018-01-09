import java.util.Arrays;
import java.util.Collections;

/**
 * Created by jinhyuk on 2017. 9. 7..
 */
public class ReverseStr {
    public String reverseStr(String str){
        String[] arr = str.split("");
        Arrays.sort(arr);
        Collections.reverse(Arrays.asList(arr));
        return String.join("",arr);
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        ReverseStr rs = new ReverseStr();
        System.out.println( rs.reverseStr("Zbcdefg") );
    }
}