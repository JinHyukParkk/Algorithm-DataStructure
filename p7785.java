import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 5. 23..
 */
public class p7785 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        ArrayList<String> stringList = new ArrayList<String>();

        while(n--!=0){
            String name = scanner.nextLine();
            String cmd = scanner.nextLine();

            if(cmd.equals("enter")){
                stringList.add(name);
            }else{
                stringList.remove(name);
            }
        }

        for(int i=0; i<stringList.size(); i++){
            System.out.println(stringList.get(i));
        }
    }
}
