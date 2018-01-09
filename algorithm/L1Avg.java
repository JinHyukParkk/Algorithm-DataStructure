/**
 * Created by jinhyuk on 2017. 9. 7..
 */
public class L1Avg {
    //Level 1 평균구하기
    public int getMean(int[] array) {
        int sum =0;
        for(int i=0; i<array.length; i++){
            sum+=array[i];
        }
        int avg = sum/array.length;
        return avg;
    }

    public static void main(String[] args) {
        int x[] = {5, 4, 3};
        L1Avg getMean = new L1Avg();
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("평균값 : " + getMean.getMean(x));
    }
}

