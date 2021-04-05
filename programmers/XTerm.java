public class XTerm {

  public long[] solution(int x, int n) {
      long[] answer = new long[n];
      long temp = x;
                     
      for(int i = 1; i <= n; i++){
          answer[i-1] = temp * i;
      }
            
      return answer;
  }

  public static void main(String[] args) {
    XTerm xt = new XTerm();
    long[] result = xt.solution(2, 5);
    for (long v : result) {
        System.err.println(v);
    }
  }
}
