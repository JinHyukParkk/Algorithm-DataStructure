package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

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
		int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            String[] temp = br.readLine().split(" ");
            bw.write(Integer.parseInt(temp[0])+Integer.parseInt(temp[1])+"\n");
        }
        bw.flush();
        br.close();
    }
	
	void sovle(){
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().start();
	}

}
