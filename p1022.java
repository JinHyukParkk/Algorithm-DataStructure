import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 20..
 */
public class p1022 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int arr[] = new int[4];
    void input() throws IOException{
        String init[] = bufferedReader.readLine().split(" ");
        for (int i = 0; i <4; i++) {
            arr[i] = Integer.parseInt(init[i]);
        }
        int maxx = Math.max(Math.max(go(arr[0], arr[1]), go(arr[2], arr[3])), Math.max(go(arr[0], arr[3]), go(arr[2], arr[3])));
        int p = String.valueOf(maxx).length();

        for (int i = arr[0]; i <=arr[2] ; i++) {
            for (int j = arr[1]; j <=arr[3] ; j++) {
                if(p==1){
                    System.out.format("%d ",go(i, j));
                }else if(p==2){
                    System.out.format("%2d ",go(i, j));
                }else if(p==3){
                    System.out.format("%3d ",go(i, j));
                }else if(p==4){
                    System.out.format("%4d ",go(i, j));
                }else if(p==5){
                    System.out.format("%5d ",go(i, j));
                }else if(p==6){
                    System.out.format("%6d ",go(i, j));
                }else if(p==7){
                    System.out.format("%7d ",go(i, j));
                }else if(p==8){
                    System.out.format("%8d ",go(i, j));
                }else if(p==9){
                    System.out.format("%9d ",go(i, j));
                }else if(p==10){
                    System.out.format("%10d ",go(i, j));
                }
            }
            System.out.println();
        }
    }
    void print(int p){
        for (int i = 1; i <p ; i++) {
            System.out.print(" ");
        }
    }
    int abs(int x){
        return Math.abs(x);
    }
    int go(int x, int y){
        if (x >= 0 && -1 * x <= y&& y <= x)
            return (x * 2 + 1)*(x * 2 + 1) - (x - y);
        else if (x<0 && x <= y && y <= abs(x) ) {
            return (abs(x) * 2)*(abs(x) * 2) - (abs(x)-1) -y ;
        } else if (y>x&& y>-1*x) {
            return ((y - 1) * 2 +1 )* ((y - 1) * 2 + 1) + (y - x);
        } else {
            return (abs(y) * 2)*(abs(y) * 2) + (x - y + 1);
        }
    }

    public static void main(String[] args) {
        p1022 test = new p1022();
        try{
            test.input();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
