import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Calculator {
    public int power(int n, int p) throws Exception{
        if(n<0 || p<0){
            throw new Exception("n and p should be non-negative");
        }else {
            return (int) Math.pow(n, p);
        }
    }
}
public class day17 {
    static Scanner sc = new Scanner(System.in);
    PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    StringBuilder sb = new StringBuilder("");

    /*
     * Complete the function below.
     */


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }

}
