import java.util.Arrays;

public class NotMaratoner {
    public static void main(String args[]) {
        String participant[] = {"mislav", "stanko", "mislav", "ana"};
        String completion[] = {"stanko", "ana", "mislav"};

        NotMaratoner nm = new NotMaratoner();

        System.out.println(nm.solution(participant, completion));
    }


    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!completion[i].equals(participant[i])) {
                answer = participant[i];
                break;
            }
        }

        if (answer.equals("")) {
            answer = participant[participant.length-1];
        }

        return answer;
    }
}
