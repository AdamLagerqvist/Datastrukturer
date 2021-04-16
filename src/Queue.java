/**
 * This should be a queue
 * Created 2020-02-14
 *
 * @author Magnus Silverdal
 */
public class Queue {
    private final LinkedList Queue;

    public Queue() {
        Queue = new LinkedList();
    }

    public void enqueue(String text) {
        Queue.addLast(new Node( "" + text, null));
    }

    public String dequeue() {
        return Queue.removeFirst();
    }

    public boolean isEmpty() {
        return Queue.size() == 0;
    }

    public int size() {
        return Queue.size;
    }
}
