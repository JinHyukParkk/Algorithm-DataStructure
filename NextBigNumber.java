/**
 * Created by jinhyuk on 2017. 9. 21..
 */
public class NextBigNumber {

    // Integer.bitCount()메소드 ,Integer.toBinaryString() 메소드 활용
    public int nextBigNumber(int n)
    {
        int answer = n+1;
        int count = Integer.bitCount(n);

        while(Integer.bitCount(answer)!=count){
            answer++;
        }
        return answer;
    }
    public static void main(String[] args)
    {
        NextBigNumber test = new NextBigNumber();
        int n = 78;
        System.out.println(test.nextBigNumber(n));
    }
}
