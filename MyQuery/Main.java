import Lists.*;
import Stack.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("MyArrayList Demonstration:");
        MyList<String> arrayList = new MyArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList Size: " + arrayList.size());
        System.out.println("First Element: " + arrayList.get(0));
        arrayList.remove(1);
        System.out.println("After removing Banana, Size: " + arrayList.size());

        System.out.println("\nMyLinkedList Demonstration:");
        MyList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        System.out.println("LinkedList Size: " + linkedList.size());
        System.out.println("Second Element: " + linkedList.get(1));
        linkedList.remove(0);
        System.out.println("After removing first element, Size: " + linkedList.size());

        System.out.println("\nMyStack Demonstration:");
        MyStack<String> stack = new MyStack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        System.out.println("Stack Size: " + stack.size());
        System.out.println("Top Element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack Size after Pop: " + stack.size());

        System.out.println("\nMyQueue Demonstration:");
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);
        System.out.println("Queue Size: " + queue.size());
        System.out.println("Front Element: " + queue.peek());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Queue Size after Dequeue: " + queue.size());

        System.out.println("\nMyMinHeap Demonstration:");
        MyMinHeap<Integer> minHeap = new MyMinHeap<>();
        minHeap.insert(50);
        minHeap.insert(30);
        minHeap.insert(20);
        minHeap.insert(10);
        minHeap.insert(40);

        System.out.println("Heap Size: " + minHeap.size());

        System.out.println("Extracting elements in order:");
        while (!minHeap.isEmpty()) {
            System.out.println("Extracted Min: " + minHeap.extractMin());
        }

        System.out.println("\nIterator Demonstration:");
        MyList<String> iterList = new MyArrayList<>();
        iterList.add("Red");
        iterList.add("Green");
        iterList.add("Blue");

        System.out.println("Iterating through ArrayList:");
        for (String color : iterList) {
            System.out.println(color);
        }
    }
}
