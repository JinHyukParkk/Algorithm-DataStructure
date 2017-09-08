import java.util.Arrays;

/**
 * Created by jinhyuk on 2017. 9. 8..
 */
public class GetMinMaxString {
    public String getMinMaxString(String str) {
        StringBuilder stringBuilder = new StringBuilder("");

        String s[] = str.split(" ");
        int arr[] = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
//        Arrays.sort(arr);
//        stringBuilder.append(arr[0]+" "+arr[s.length-1]);
        stringBuilder.append(Arrays.stream(arr).min().getAsInt()+" "+ Arrays.stream(arr).max().getAsInt());
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String str = "1 2 3 4";
        GetMinMaxString minMax = new GetMinMaxString();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    }
}
