/**
 * Created by jinhyuk on 2017. 10. 19..
 */
public class Hash {
    //분리 연결법 Hash Table.
    private class Entry{
        private int value;
        public Entry next;
    }

    private int size;
    private Entry[] hTable;

    public Hash(int size){
        this.size = size;
        this.hTable = new Entry[size];
    }

    // key 값으로 HashTable에 저장될 index를 반환한다.
    public int hashMethod(int key){
        return key % size;
    }

    // 저장할 데이터로 key를 추출한다.
    // 실제 Hash 에는 특별한 알고리즘이 적용되 hashCode를 얻는다.
    public int getKey(int data){
        return data;
    }{}
    public static void main(String[] args) {

    }
}
