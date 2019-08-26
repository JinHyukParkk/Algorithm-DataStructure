import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    StringBuilder sb = new StringBuilder("");
    
    int n,m;
    
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
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        m = Integer.parseInt(stringTokenizer.nextToken());
        
        bufferedReader.close();
    }
	
	void sovle(){
        sb.append(n*(m%10) + "\n");
        sb.append(n*(m/10%10) + "\n");
        sb.append(n*(m/100) + "\n");
        sb.append(n*m);
        System.out.println(sb.toString());
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().start();
	}

}
