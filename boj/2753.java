import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    StringBuilder sb = new StringBuilder("");
    
    int n;
    
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
        
        bufferedReader.close();
    }
	
	void sovle(){
		if(n%4 == 0 && n%100 != 0 || n%400 == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().start();
	}

}
