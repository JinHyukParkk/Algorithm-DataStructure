import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OpenChat {
    
    class Command {
        String action;
        String id;

        Command(String action, String id) {
            this.action = action;
            this.id = id;
        }
    }

    public String[] solution(String[] record) {
        String[] answer = {};

        List<Command> list = new ArrayList<>();
        Map<String, String> idStore = new HashMap<>();

        for (String s : record) {
            String[] sa = s.split("\\s+");

            String action = sa[0];
            String id = sa[1];
            String nick = sa[2];

            if (action.equals("Enter") || action.equals("Leave")) {
                Command command = new Command(action, id);
                list.add(command);
                
                if (idStore.get(id) == null) {
                    idStore.put(id, nick);
                }
            } else {
                idStore.put(id, nick);
            }

            
        }

        return answer;
    }

    public static void main(String[] args) {
        OpenChat openChat = new OpenChat();

        String[] givenArr = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        
        for (String s : openChat.solution(givenArr)) {

        }
    }
}
