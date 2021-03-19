import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hook {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;

    public void solve() throws IOException
    {
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int k = Integer.parseInt(stringTokenizer.nextToken());
        int arr[] = new int[n+4];
        int answer = 0;

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        
        int idx = 1;
        while(true) {
            if (idx > n) break;
            if (idx == 1) {
                idx += k;
            } else {
                idx += k-1;
            }
            answer++;
        }
        System.out.println(answer);
        
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Hook h = new Hook();
        try{
            h.solve();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
