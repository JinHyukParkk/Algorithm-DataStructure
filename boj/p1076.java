import java.io.*;
import java.util.StringTokenizer;

public class p1076 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");

        long ans = 0;
        for (int i = 0; i < 2; i++) {
            String str = br.readLine();
            ans *=10;
            if(str.equals("black")){
                ans+=0;
            }else if(str.equals("brown")){
                ans+=1;
            }else if(str.equals("red")){
                ans+=2;
            }else if(str.equals("orange")){
                ans+=3;
            }else if(str.equals("yellow")){
                ans+=4;
            }else if(str.equals("green")){
                ans+=5;
            }else if(str.equals("blue")){
                ans+=6;
            }else if(str.equals("violet")){
                ans+=7;
            }else if(str.equals("grey")){
                ans+=8;
            }else if(str.equals("white")){
                ans+=9;
            }
        }
        for (int i = 0; i < 1; i++) {
            String str = br.readLine();
            if(str.equals("black")){
                ans*=1;
            }else if(str.equals("brown")){
                ans*=10;
            }else if(str.equals("red")){
                ans*=100;
            }else if(str.equals("orange")){
                ans*=1000;
            }else if(str.equals("yellow")){
                ans*=10000;
            }else if(str.equals("green")){
                ans*=100000;
            }else if(str.equals("blue")){
                ans*=1000000;
            }else if(str.equals("violet")){
                ans*=10000000;
            }else if(str.equals("grey")){
                ans*=100000000;
            }else if(str.equals("white")){
                ans*=1000000000;
            }
        }
        sb.append(ans);
        bw.write(sb.toString());
        bw.close();
    }
}
