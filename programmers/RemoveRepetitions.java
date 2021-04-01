public class RemoveRepetitions {
    public static String transform(String input) {
        StringBuilder sb = new StringBuilder();

        char compChar = input.charAt(0);
        sb.append(compChar);

        for (int i = 1; i < input.length(); i++) {
            char nextChar = input.charAt(i);

            if (compChar != nextChar) {
                compChar = nextChar;
                sb.append(compChar);
            }
        }

        return sb.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(RemoveRepetitions.transform("abbcbbb"));        
    }
}