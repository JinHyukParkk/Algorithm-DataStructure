public class BlindPhoneNum {
    public String solution(String phone_number) { 
        StringBuilder sb = new StringBuilder("");
        int len = phone_number.length();

        for(int i = 0; i < len; i++) { 
            if(i < len - 4) {
                sb.append("*");
            } else { 
                sb.append(phone_number.charAt(i));
            } 
        }
        return sb.toString(); 
    }

    public static void main(String[] args) {
        BlindPhoneNum bpn = new BlindPhoneNum();

        System.out.println(bpn.solution("01033334444"));
    }

}
