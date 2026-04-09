public class MyMinHeap<T extends Comparable<T>> {        //чтобы можно было сравнивать 
    private MyArrayList<T> list = new MyArrayList<>();      //ArrayList как базу

    public void insert(T item) {
        list.add(item);           //Add в конец списка
        traverseUp(list.size() - 1); //в вверх
    }

    public T extractMin() {
        if (list.size() == 0) return null;
        
        T min = list.getFirst(); 
        
        // Берем последний элемент и ставим его в начало, потом вниз
        if (list.size() > 1) {
            list.set(0, list.getLast()); 
            list.removeLast(); // Удаляем дубликат с конца
            traverseDown(0); // Опускаем вниз
        } else {
            list.removeLast();
        }
        return min;
    }

    // Поднимаем элемент вверх
    private void traverseUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2; 
            if (list.get(index).compareTo(list.get(parentIndex)) < 0) {
                swap(index, parentIndex);
                index = parentIndex;
            } else {
                break; // Всё
            }
        }
    }

    // Опускаем вниз
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

    //Рокировка
    private void swap(int index1, int index2) {
        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    public int size() {
        return list.size();
    }
}
