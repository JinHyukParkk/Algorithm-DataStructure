public class PtoY {
    boolean solution(String s) {
        s = s.toLowerCase();
        int cnt = 0;

        char[] s_char = s.toCharArray();
        
        for (int i =0; i<s_char.length; i++) {
            if (s_char[i] == 'p'|| s_char[i] == 'P') {
                cnt++;
            } else if (s_char[i] == 'y'||s_char[i] == 'Y') {
                cnt--;
            }
        }
        if (cnt == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void  main(String[] args){
        PtoY py = new PtoY();
        System.out.println(py.solution("pPooYy"));
    }
}
