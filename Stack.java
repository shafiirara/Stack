public class Stack<E> {

    private static class Node<E> {
        E data;
        Node<E> below; 

        Node(E data) {
            this.data = data;
        }
    }

    private Node<E> top; 
    private int count;   

    public void push(E item) {
        Node<E> newNode = new Node<>(item);
        newNode.below = top;
        top = newNode;
        count++;
    }

    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack kosong, tidak bisa pop!");
        }
        E removed = top.data;
        top = top.below;
        count--;
        return removed;
    }

 
    public E peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack kosong, tidak ada yang bisa dilihat!");
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return count;
    }


    public void clear() {
        top = null;
        count = 0;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[kosong]";
        }
        StringBuilder sb = new StringBuilder("TOP -> ");
        Node<E> current = top;
        while (current != null) {
            sb.append(current.data);
            if (current.below != null) {
                sb.append(" -> ");
            }
            current = current.below;
        }
        return sb.toString();
    }
}