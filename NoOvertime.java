import java.util.Arrays;

/**
 * Created by jinhyuk on 2017. 9. 21..
 */
public class NoOvertime {
    // 반복문에 max값 찾기₩
    public int noOvertime(int no, int[] works) {
        while(no!=0){
            Arrays.sort(works);
            works[works.length-1]-=1;
            no--;
        }
        int result =0;
        for (int i = 0; i <works.length ; i++) {
            result+=Math.pow(works[i],2);
        }

//        ArrayList<Integer> worksArr = toArrayList(works);
//
//        //proc
//        for(int x=0 ; x<no ; x++) {
//            int tmp = Collections.max(worksArr);
//            int i = worksArr.indexOf(tmp);
//            worksArr.set(i,tmp-1);
//        }
//        for(int work : worksArr) {
//            result += Math.pow(work,2);
//        }
        return result;
    }
    public static void main(String[] args) {
        NoOvertime c = new NoOvertime();
        int []test = {4,3,3};
        System.out.println(c.noOvertime(4,test));
    }
}
