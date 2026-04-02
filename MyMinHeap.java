public class MyMinHeap<T extends Comparable<T>> {
    private MyArrayList<T> list = new MyArrayList<>();

    public void insert(T item) {
        list.add(item);
        traverseUp(list.size() - 1);
    }

    public T extractMin() {
        T min = list.getFirst();
        list.set(0, list.getLast());
        list.removeLast();
        traverseDown(0);
        return min;
    }

    private void traverseUp(int index) {
        while (index > 0 && list.get(index).compareTo(list.get((index - 1) / 2)) < 0) {
            swap(index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    private void traverseDown(int index) {
        while (2 * index + 1 < list.size()) {
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;
            int smallestChild = leftChild;
            if (rightChild < list.size() && list.get(rightChild).compareTo(list.get(leftChild)) < 0) {
                smallestChild = rightChild;
            }
            if (list.get(index).compareTo(list.get(smallestChild)) <= 0) break;
            swap(index, smallestChild);
            index = smallestChild;
        }
    }

    private void swap(int index1, int index2) {
        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    public T getMin() { return list.getFirst(); }
    public int size() { return list.size(); }
}
