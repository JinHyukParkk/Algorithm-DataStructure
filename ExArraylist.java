import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by jinhyuk on 2017. 10. 2..
 */
public class ExArraylist {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<String> arrayList = new ArrayList<String>();

    void start() throws IOException{
        String str;
        while(true){
            System.out.print("1.음식추가 2.음식삭제 3.음식목록 0.종료 : ");
            int seNum = Integer.parseInt(bufferedReader.readLine());
            if(seNum == 0 ) break;
            switch (seNum){
                case 1:
                    System.out.print("추가할 음식 : ");
                    str = bufferedReader.readLine();
                    foodadd(str);
                    break;
                case 2:
                    System.out.print("삭제할 음식 : ");
                    str = bufferedReader.readLine();
                    foodremove(str);
                    break;
                case 3:
                    foodlist();
                    break;
                default:
                    break;
            }
        }
    }
    public void foodadd(String str){
        arrayList.add(str);
    }
    public void foodremove(String str){
        try{
            arrayList.remove(str);
        }catch(Exception e){
            System.out.println("해당 과일이 없습니다.");
        }

    }
    public void foodlist(){
        ListIterator iterator = arrayList.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args) {
        try{
            new ExArraylist().start();
        }catch(IOException e){
            e.printStackTrace();
        }


    }
}
