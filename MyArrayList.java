public class MyArrayList<T> implements MyList<T> {
    private Object[] elements; 
    private int size;
// Default constructor, starting small but we move
    public MyArrayList() {
        this.elements = new Object[10];
        this.size = 0;
    }

    // Making the array bigger because it's full
    private void increaseBuffer() {
        Object[] newElements = new Object[elements.length * 2];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    // Adding a new item to the squad 
    @Override
    public void add(T item) {
        if (size == elements.length) {
            increaseBuffer();
        }
        elements[size++] = item;
    }

    // Deleting an element and shifting others
    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
    }
}
