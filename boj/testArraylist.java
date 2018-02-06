import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by jinhyuk on 2017. 9. 20..
 */
public class testArraylist {
    ArrayList<String> list = new ArrayList<String>();
    void test(){
        list.add("ONE");
        list.add("TWO");
        list.add("THREE");
        System.out.println("Current Size : " + list.size());
        list.remove("TWO");
        System.out.println("Current Size : " + list.size());
        list.add(1, "DOUBLE");
        ListIterator iterator = list.listIterator();
        System.out.println("------Forward------");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("------Backward------");
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println("------print------");
        list.add(null);
        System.out.println(list);
        System.out.println("------중복 저장 가능------");
        list.add("ONE");
        System.out.println(list);
        System.out.println("------맨 앞에꺼 삭제된다------");
        list.remove("ONE");
        System.out.println(list);
        System.out.println("------Array를 List로------");
        String arr[] = new String[] {"one","two","three"};
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
        int array[] ={1,2,3};           //primitive(원자성) type인 int는 직접 옮겨 줘야 함
        List<Integer> list1 = new ArrayList<>();
        for(int a : array){
            list1.add(a);
        }
        System.out.println(list1.contains(1));
        System.out.println(list1);
        System.out.println("------Collections Array를 List로------");
        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2, arr);
        System.out.println(list2);
        List<String> list3 = Arrays.stream(arr).collect(Collectors.toList());
        System.out.println(list3);
        System.out.println("------Collections List를 Array로------");
        String arr1[] = new String[list3.size()];
        list.toArray(arr1);
        for(String s:arr1){
            System.out.println(s);
        }

    }

    public static void main(String[] args) {
        testArraylist testArraylist = new testArraylist();
        testArraylist.test();
    }
}
