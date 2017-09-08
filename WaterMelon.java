/**
 * Created by jinhyuk on 2017. 9. 7..
 */
public class WaterMelon {
    public String watermelon(int n){
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i <n ; i++) {
            stringBuilder.append(i%2==0?"수":"박");
        }
        return stringBuilder.toString();
    }

    // 실행을 위한 테스트코드입니다.
    public static void  main(String[] args){
        WaterMelon wm = new WaterMelon();
        System.out.println("n이 3인 경우: " + wm.watermelon(3));
        System.out.println("n이 4인 경우: " + wm.watermelon(4));
    }
}