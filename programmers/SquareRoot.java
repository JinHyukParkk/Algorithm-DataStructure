public class SquareRoot {
    public long solution(long n) {
        Double sqrt = Math.sqrt(n);
        
        if(sqrt == sqrt.intValue()){
            return (long)Math.pow(sqrt + 1, 2);
        } else return -1;
    }
    public static void main(String[] args) {
        SquareRoot s = new SquareRoot();

        System.out.println(s.solution(121));

    }
}
