public class MyLinkedList<T> implements MyList<T> {
    private class MyNode {
        T data;
        MyNode next;
        MyNode prev;

        MyNode(T data) {
            this.data = data;
        }
    }

    private MyNode head;
    private MyNode tail;
    private int size;

    @Override
    public void addLast(T item) {
        MyNode newNode = new MyNode(item);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void add(T item) {
        addLast(item);
    }

    @Override
    public T getFirst() {
        if (head == null) return null;
        return head.data;
    }

    @Override
    public void removeFirst() {
        if (head == null) return;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    // Остальные 
    @Override public void addFirst(T item) {
        MyNode newNode = new MyNode(item);
        if (head == null) { head = tail = newNode; }
        else { newNode.next = head; head.prev = newNode; head = newNode; }
        size++;
    }
    @Override public T getLast() { return tail != null ? tail.data : null; }
    @Override public void removeLast() {}
    @Override public void remove(int index) {}
    @Override public T get(int index) { return null; }
    @Override public void set(int index, T item) {}
    @Override public void add(int index, T item) {}
    @Override public void sort() {}
    @Override public int indexOf(Object object) { return -1; }
    @Override public int lastIndexOf(Object object) { return -1; }
    @Override public boolean exists(Object object) { return false; }
    @Override public Object[] toArray() { return new Object[0]; }
    @Override public void clear() { head = tail = null; size = 0; }
    @Override public java.util.Iterator<T> iterator() { return null; }
}
