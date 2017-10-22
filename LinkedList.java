/**
 * Created by jinhyuk on 2017. 10. 17..
 */
public class LinkedList {
    private Node header;
    private int size;
    public LinkedList() {
        this.header = null;
        this.size = 0;
    }
    class Node {
        private Object data;
        private Node nextNode;

        Node(Object data) {
            this.data = data;
            this.nextNode = null;
        }
    }
    public Object get(int index){
        return getNode(index).data;
    }
    public Node getNode(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index : " + index + ", Size : " + size);
        }
        Node node = header.nextNode;
        for (int i = 0; i < index; i++) {
            node = node.nextNode;
        }
        return node;
    }
    public void firstAdd(Object data){
        Node newNode = new Node(data);
        newNode.nextNode = header.nextNode;
        header.nextNode = newNode;
        size++;
    }
    public void add(int index, Object data){
        if(index == 0){
            firstAdd(data);
            return;
        }
        Node previous = getNode(index-1);
        Node next = previous.nextNode;
        Node newNode = new Node(data);
        previous.nextNode = newNode;
        newNode.nextNode = next;
        size++;
    }
    public void firstRemove(){
        header.nextNode = header.nextNode.nextNode;
        size--;
    }
    public void remove(int index){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("Index : " + index + ", Size : " +size);
        }else if(index ==0){
            firstRemove();
            return;
        }
        Node privious = getNode(index-1);
        privious.nextNode = privious.nextNode.nextNode;
        size--;
    }
}
