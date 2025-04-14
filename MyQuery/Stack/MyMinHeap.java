package Stack;

import Lists.MyArrayList;
import java.util.NoSuchElementException;

public class MyMinHeap<T extends Comparable<T>> {
    private MyArrayList<T> list = new MyArrayList<>();

    public void insert(T element) {
        list.add(element);
        siftUp(list.size() - 1);
    }

    public T extractMin() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T min = list.get(0);
        T lastElement = list.get(list.size() - 1);
        list.remove(list.size() - 1);

        if (!isEmpty()) {
            list.add(lastElement);
            siftDown(0);
        }

        return min;
    }

    private void siftUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (list.get(index).compareTo(list.get(parentIndex)) < 0) {
                swap(index, parentIndex);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    private void siftDown(int index) {
        int smallest = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;

        if (leftChild < list.size() &&
                list.get(leftChild).compareTo(list.get(smallest)) < 0) {
            smallest = leftChild;
        }

        if (rightChild < list.size() &&
                list.get(rightChild).compareTo(list.get(smallest)) < 0) {
            smallest = rightChild;
        }

        if (smallest != index) {
            swap(index, smallest);
            siftDown(smallest);
        }
    }

    private void swap(int i, int j) {
        T temp = list.get(i);
        list.removeAndReturn(i);
        list.add(i, list.get(j - 1));
        list.removeAndReturn(j);
        list.add(j, temp);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}