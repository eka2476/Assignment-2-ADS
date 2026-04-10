public class Main {
    public static void main(String[] args) {
        // Тест ArayList
        MyList<String> arrayList = new MyArrayList<>();
        arrayList.add("Java is cool");
        arrayList.add("Python is ok too");
        System.out.println("ArrayList size: " + arrayList.size()); // Должно быть 2

        // Тест LinkedList
        MyList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(777);
        linkedList.addFirst(111);
        System.out.println("LL first: " + linkedList.getFirst()); // Должно быть 111

        // проверить LIFO
        MyStack<String> stack = new MyStack<>();
        stack.push("First");
        stack.push("Last");
        System.out.println("Stack pop: " + stack.pop()); // Ждем Last

        //провка что вылетает самый мелкий.
        MyMinHeap<Integer> heap = new MyMinHeap<>();
        heap.insert(100);
        heap.insert(5);
        heap.insert(50);
        System.out.println("Min in heap: " + heap.extractMin()); // Должно быть 5
        
        System.out.println("vrode rabotaet");
    }
}
