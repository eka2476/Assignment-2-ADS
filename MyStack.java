public class MyStack<T> {
    private MyArrayList<T> list = new MyArrayList<>();

    public void push(T item) {  //Push it to the limit
        list.addLast(item);
    }

    public T pop() {       // Забираем последний элемент
        T item = list.getLast();
        list.removeLast();
        return item;
    }

    public T peek() {      //Чисто посмотреть
        return list.getLast();
    }

    public boolean isEmpty() {     // Проверка на пустоту
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }
}
