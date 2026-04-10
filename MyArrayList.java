public class MyArrayList<T> implements MyList<T> {
    private Object[] elements;
    private int size;

    public MyArrayList() {
        this.elements = new Object[10];
        this.size = 0;
    }

    private void increaseBuffer() {
        Object[] newElements = new Object[elements.length * 2];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    @Override
    public void add(T item) {
        if (size == elements.length) {
            increaseBuffer();
        }
        elements[size++] = item;
    }

    @Override
    public void addLast(T item) {
        add(item);
    }

    @Override
    public T getLast() {
        if (size == 0) return null;
        return (T) elements[size - 1];
    }

    @Override
    public void removeLast() {
        if (size > 0) {
            elements[--size] = null;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        return (T) elements[index];
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = null;
    }

    @Override public void set(int index, T item) { elements[index] = item; }
    @Override public void add(int index, T item) {}
    @Override public void addFirst(T item) {}
    @Override public T getFirst() { return size > 0 ? (T) elements[0] : null; }
    @Override public void removeFirst() { if (size > 0) remove(0); }
    @Override public void sort() {}
    @Override public int indexOf(Object object) { return -1; }
    @Override public int lastIndexOf(Object object) { return -1; }
    @Override public boolean exists(Object object) { return false; }
    @Override public Object[] toArray() { return new Object[0]; }
    @Override public void clear() { size = 0; }
    @Override public java.util.Iterator<T> iterator() { return null; }
}
