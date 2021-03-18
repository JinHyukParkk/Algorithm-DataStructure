public class PtoY {
    boolean solution(String s) {
        boolean answer = true;

        int p_cnt = 0, y_cnt = 0;

        char[] s_char = s.toCharArray();
        
        for (int i =0; i<s_char.length; i++) {
            if (s_char[i] == 'p'|| s_char[i] == 'P') {
                p_cnt++;
            } else if (s_char[i] == 'y'||s_char[i] == 'Y') {
                y_cnt++;
            }
        }
        if (p_cnt == y_cnt) {
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
