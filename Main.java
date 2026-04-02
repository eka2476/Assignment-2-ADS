public class Main {
    public static void main(String[] args) {
        MyList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.addFirst(5);
        System.out.println("ArrayList size: " + arrayList.size()); 
        MyList<String> linkedList = new MyLinkedList<>();
        linkedList.add("Apple");
        linkedList.addFirst("Banana");
        System.out.println("LinkedList first: " + linkedList.getFirst()); 
        MyMinHeap<Integer> heap = new MyMinHeap<>();
        heap.insert(50);
        heap.insert(10);
        heap.insert(30);
        System.out.println("Heap min: " + heap.extractMin()); 
        for (Integer item : arrayList) {
            System.out.print(item + " ");
        }
    }
}
