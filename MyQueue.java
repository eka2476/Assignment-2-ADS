public class MyQueue<T> {
    private MyLinkedList<T> list = new MyLinkedList<>();

    public void enqueue(T item) {    //queue...
        list.addLast(item);
    }

    public T dequeue() {        //first entry
        T item = list.getFirst();
        list.removeFirst();
        return item;
    }

    public T peek() {      //who first to exit
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }
}
