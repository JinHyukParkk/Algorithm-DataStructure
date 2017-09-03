
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class p10845 {
    BufferedReader bufferdReader = new BufferedReader(new InputStreamReader(System.in));
    void input() throws Exception{
        Queue<Integer> queue = new Queue();
        int n = Integer.parseInt(bufferdReader.readLine());

        for (int i = 0; i < n ; i++) {
            String s = bufferdReader.readLine();
            command(queue,s);
        }
    }
    public void command(Queue<Integer> queue, String input){
        String[] splits = input.split(" ");
        Integer result;
        switch (splits[0]) {
            case "push":
                queue.enqueue(Integer.parseInt(splits[1]));
                break;
            case "pop":
                System.out.println(queue.isEmpty()? "-1" : queue.dequeue());
                break;
            case "size":
                System.out.println(queue.getSize());
                break;
            case "empty":
                System.out.println(queue.isEmpty()? "1":"0");
                break;
            case "front":
                System.out.println(queue.isEmpty()? "-1":queue.getFront());
                break;
            case "back":
                System.out.println(queue.isEmpty()?"-1":queue.getBack());
                break;
            default:
                break;
        }
    }
    public static void main(String[] args) {
        p10845 test = new p10845();
        try {
            test.input();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class Queue<E> {
    private Node<E> front;
    private Node<E> back;
    private int count;

    public void enqueue(E data) {
        Node<E> newNode = new Node<E>(data);
        if (front == null) {
            front = newNode;
            back = newNode;
        } else {
            back.next = newNode;
            back = newNode;
        }
        count++;
    }

    public E dequeue() {
        Node<E> temp = front;
        if (temp == null)
            return null;
        if (front.next == null) {
            front = null;
            back = null;
        } else {
            front = front.next;
        }
        count--;
        return temp.data;
    }

    public boolean isEmpty() {
        return (front == null);
    }

    public int getSize() {
        return count;
    }

    public E getFront(){
        if(front!=null)
            return front.data;
        else
            return null;
    }

    public E getBack(){
        if(back!=null)
            return back.data;
        else
            return null;
    }

    class Node<E> {
        E data;
        Node<E> next;
        Node(E data) {
            this.data = data;
        }
    }
}
