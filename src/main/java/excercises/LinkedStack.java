package excercises;

public class LinkedStack<T> implements Stack<T>{

    private static class Entry<T>{

        private T value;
        private Entry<T> prev;

        public Entry(T value, Entry<T> prev) {
            this.value = value;
            this.prev = prev;
        }
    }

    private int size = 0;
    private Entry<T> head;

    @Override
    public void push(T item) {
        Entry<T> entry = new Entry<>(item, head);
        head = entry;
        size++;
    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
