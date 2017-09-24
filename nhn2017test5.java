import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 23..
 */
public class nhn2017test5 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int pri_c[] = new int[3];
    int people;
    String p_r[][];

    void input() throws IOException{
        String str[] = bufferedReader.readLine().split("\\s");
        for (int i = 0; i <3; i++) {
            pri_c[i] = Integer.parseInt(str[i]);
        }
        people = Integer.parseInt(bufferedReader.readLine());
        p_r = new String[people][3];
        for (int i = 0; i < people; i++) {
            str = bufferedReader.readLine().split("\\s");
            p_r[i][0] = str[0];
            p_r[i][1] = str[1];
            if(str.length != 2){ p_r[i][2] = str[2];}
            else p_r[i][2]=null;
        }
    }
    void solve(){
        for (int i = 2; i >=0; i--) {
            if(pri_c[i] == 1) condition1();
            else if(pri_c[i] == 2) condition2();
            else{ condition3();}
        }
        for (int i = 0; i < people; i++) {
            if(p_r[i][2] != null){
                System.out.println(p_r[i][0]+" "+p_r[i][1]+" "+p_r[i][2]);
            }else{
                System.out.println(p_r[i][0]+" "+p_r[i][1]);
            }

        }
    }
    void swap(int a, int b){
        String temp[] = new String[3];
        for (int i = 0; i <3 ; i++) {
            temp[i] = p_r[a][i];
            p_r[a][i] = p_r[b][i];
            p_r[b][i] = temp[i];
        }
    }
    void condition1(){
        for (int i = 0; i < people-1; i++) {
            for (int j = i+1; j < people; j++) {
                if(p_r[i][0].equals("M") && p_r[j][0].equals("F")){
                    swap(i,j);
                }
            }
        }
    }
    void condition2(){
        for (int i = 0; i <people-1 ; i++) {
            for (int j = i+1; j < people; j++) {
                int a = Integer.parseInt(p_r[i][1]);
                int b = Integer.parseInt(p_r[j][1]);
                if(a<=7 && b<=7 && a>b){
                    swap(i,j);
                }else if(a>7 && b<=7){
                    swap(i,j);
                }else if(a>7 && b>7 && a<b){
                    swap(i,j);
                }
            }
        }
    }
    void condition3(){
        for (int i = 0; i < people-1; i++) {
            for (int j = i+1; j < people; j++) {
                if(p_r[i][2]==null || p_r[j][2]==null){
                    if(p_r[i][2]!=null && p_r[j][2]==null){
                        swap(i,j);
                    }
                }else{
                    if(p_r[i][2].equals("P") && p_r[j][2].equals("DP")){
                        swap(i,j);
                    }else if(p_r[i][2].equals("P") && p_r[j][2].equals("PW")){
                        swap(i,j);
                    }else if(p_r[i][2].equals("DP") && p_r[j][2].equals("PW")){
                        swap(i,j);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        nhn2017test5 test = new nhn2017test5();
        try{
            test.input();
            test.solve();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
