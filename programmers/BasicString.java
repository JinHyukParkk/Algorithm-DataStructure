import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BasicString {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    StringBuilder sb = new StringBuilder("");

    public void solve() throws IOException
    {
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        
        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            long l_coupon = Long.parseLong(stringTokenizer.nextToken());
            long n_coupon = Long.parseLong(stringTokenizer.nextToken());

            long l_cnt = (l_coupon + n_coupon) / 12;

            long max_goods = Math.min(l_cnt, l_coupon / 5);

            sb.append(max_goods);
            sb.append("\n");
        }

        System.out.println(sb);
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
