package Stack;

import Lists.MyArrayList;
import java.util.EmptyStackException;

public class MyStack<T> {
    private MyArrayList<T> list = new MyArrayList<>();

    public void push(T element) {
        list.add(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T element = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return element;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}