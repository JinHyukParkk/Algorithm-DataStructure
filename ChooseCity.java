import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by jinhyuk on 2017. 9. 22..
 */
 public class ChooseCity
{
    // 정렬 후 인구 수 반 이상 차지하는 곳이 정답
    public int chooseCity(int n, int [][]city)
    {
        int total = 0, cur=0, answer = 0;
        Arrays.sort(city, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]>o2[0]) return 1;
                else return -1;
            }
        });

        for (int i = 0; i < n; i++) {
            total += city[i][1];
        }
        for (int i = 0; i <n ; i++) {
            cur += city[i][1];
            if(cur>=total/2){
                answer = city[i][0];
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args)
    {
        ChooseCity test = new ChooseCity();
        int tn = 3;
        int [][]tcity = {{1,5},{2,2},{3,3}};
        System.out.println(test.chooseCity(tn,tcity));
    }
}
