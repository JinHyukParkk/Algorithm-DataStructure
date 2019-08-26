import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    StringBuilder sb = new StringBuilder("");
    
    int n, m;
    
	void start(){
        try{
            input();
            sovle();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
	
	void input() throws IOException{
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        n = Integer.parseInt(stringTokenizer.nextToken());
        m = Integer.parseInt(stringTokenizer.nextToken());
        
        bufferedReader.close();
    }
	
	void sovle(){
		if (m < 45) {
			
			m += 15;
			if(n == 0) {
				n = 23;
			} else {
				n -= 1;
			}
		} else {
			m -= 45;
		}
		sb.append(n + " " + m);
		System.out.println(sb.toString());
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().start();
	}

}
