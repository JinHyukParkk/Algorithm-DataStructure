import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BasicString {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    StringBuilder sb = new StringBuilder("");

    public boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6) {
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if(ch < '0' || ch > '9')
					return false;
			}
			return true;
		} else
			return false;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        BasicString o = new BasicString();
        try{
            o.solve();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
