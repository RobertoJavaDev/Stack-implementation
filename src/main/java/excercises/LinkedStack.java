package excercises;

public class LinkedStack<T> implements Stack<T>{

    private class Entry<T>{

        private T value;
        private Entry<T> prev;

        public Entry(T value, Entry<T> prev) {
            this.value = value;
            this.prev = prev;
        }
    }

    @Override
    public void push(T item) {

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
