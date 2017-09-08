/**
 * Created by jinhyuk on 2017. 9. 8..
 */
class StringExercise{
    String getMiddle(String word){
        int n = word.length();
        return (word.length()%2==0) ? word.substring(n/2-1,n/2+1):word.substring(n/2,n/2+1);
//        if(word.length()%2!=0){
//            return word.substring(word.length()/2,word.length()/2+1);
//        }else{
//            return word.substring(word.length()/2-1,word.length()/2+1);
//        }
    }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
    }
}
