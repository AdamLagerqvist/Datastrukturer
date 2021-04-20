/**
 * This is a class
 * Created 2020-02-14
 *
 * @author Magnus Silverdal
 */
public class Node<T> {
    T data;
    Node next;

    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}
