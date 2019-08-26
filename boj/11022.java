
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    StringBuilder sb = new StringBuilder("");
    
    int n, m;
    int a[][];
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
        a = new int[n][2];
        for (int i = 0; i<n; i++) {
        	stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        	a[i][0] = Integer.parseInt(stringTokenizer.nextToken());
        	a[i][1] = Integer.parseInt(stringTokenizer.nextToken());
        	System.out.println("Case #" + (i+1) + ": " + a[i][0] + " + " + a[i][1] + " = " + (a[i][0]+a[i][1]));
        }
        bufferedReader.close();
    }
	
	void sovle(){
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().start();
	}

}
