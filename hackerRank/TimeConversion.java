import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    static String timeConversion(String s) {
        // Complete this function
        StringBuilder sb = new StringBuilder("");
        int hour = Integer.parseInt(s.substring(0,2));
        if(s.charAt(8)=='A'){
            if(hour==12){
                sb.append("00");
            }else{
                sb.append(s.substring(0,2));
            }
        }else{
            if(hour<12) {
                sb.append(hour+12);
            }else{
                sb.append(s.substring(0,2));
            }
        }
        sb.append(s.substring(2,8));
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}

