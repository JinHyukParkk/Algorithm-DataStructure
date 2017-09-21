import java.util.Calendar;

/**
 * Created by jinhyuk on 2017. 9. 20..
 */
public class getDayName1 {
    public String getDayName(int a, int b)
    {
//        int sum =0;
//        int n[] = {31,29,31,30,31,30,31,31,30,31,30,31};
//        String s[] = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
//
//        for (int i = 0; i <a-1 ; i++) {
//            sum+=n[i];
//        }
//        sum+=b;
//        return s[sum%7];
        String answer[] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        Calendar cal = Calendar.getInstance();
        cal.set(2016 ,a-1 ,b);
        int ab=cal.get(Calendar.DAY_OF_WEEK)-1;

        return answer[ab];
    }
    public static void main(String[] args)
    {
        getDayName1 test = new getDayName1();
        int a=5, b=24;
        System.out.println(test.getDayName(a,b));
    }
}

