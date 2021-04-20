/**
 * This should be a queue
 * Created 2020-02-14
 *
 * @author Magnus Silverdal
 */
public class Queue<T> {
    private LinkedList Queue;

    public Queue() {
        Queue = new LinkedList<T>();
    }

    public void enqueue(T data) {
        Queue.addLast(new Node( data, null));
    }

    public T dequeue() {
        return (T) Queue.removeFirst();
    }

    public boolean isEmpty() {
        return Queue.size() == 0;
    }

    public int size() {
        return Queue.size;
    }
}
