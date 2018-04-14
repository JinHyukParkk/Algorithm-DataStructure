/**
 * Created by jinhyuk on 2017. 9. 7..
 */
public class PrintTriangle {
    public String printTriangle(int num){
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i <num ; i++) {
            for (int j = 0; j <i+1 ; j++) {
                stringBuilder.append("*");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        PrintTriangle pt = new PrintTriangle();
        System.out.println( pt.printTriangle(3) );
    }
}
