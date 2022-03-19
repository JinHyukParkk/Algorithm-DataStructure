import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OpenChat {
    
    private static final String ENTER = "Enter";
    private static final String LEAVE = "Leave";
    private static final String ENTER_FORMAT = "님이 들어왔습니다.";
    private static final String LEAVE_FORMAT = "님이 나갔습니다.";
    


    class Command {
        String action;
        String id;

        Command(String action, String id) {
            this.action = action;
            this.id = id;
        }
    }

    public String[] solution(String[] record) {

        List<Command> commandList = new ArrayList<>();
        Map<String, String> idStore = new HashMap<>();
        List<String> result = new ArrayList<>();

        for (String s : record) {
            String[] sa = s.split("\\s+");

            String action = sa[0];
            String id = sa[1];
            String nick = "";
            

            if (action.equals(ENTER)) {
                Command command = new Command(action, id);
                commandList.add(command);
                nick = sa[2];
                idStore.put(id, nick);
            } else if (action.equals(LEAVE)) {
                Command command = new Command(action, id);
                commandList.add(command);
            }
            else {
                nick = sa[2];
                idStore.put(id, nick);
            }            
        }

        for (Command command : commandList) {
            if (command.action.equals(ENTER)) {
                result.add(idStore.get(command.id) + ENTER_FORMAT);
            } else if (command.action.equals(LEAVE)) {
                result.add(idStore.get(command.id) + LEAVE_FORMAT);
            }
        }

        return result.toArray(new String[result.size()]);
    }

    public static void main(String[] args) {
        OpenChat openChat = new OpenChat();

        String[] givenArr = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        
        for (String s : openChat.solution(givenArr)) {
            System.out.println(s);
        }
    }
}
