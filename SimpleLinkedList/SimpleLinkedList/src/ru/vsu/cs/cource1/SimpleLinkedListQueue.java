package ru.vsu.cs.cource1;

public class SimpleLinkedListQueue<T> implements SimpleQueue<T> {

    private class SimpleLinkedListNode {
        public T value;
        public SimpleLinkedListNode next;

        public SimpleLinkedListNode(T value, SimpleLinkedListNode next) {
            this.value = value;
            this.next = next;
        }

        public SimpleLinkedListNode(T value) {
            this(value, null);
        }
    }

    private SimpleLinkedListNode head = null;
    private SimpleLinkedListNode tail = null;

    @Override
    public void add(T value) {
        if (count() == 0) {
            head = tail = new SimpleLinkedListNode(value);
        } else {
            tail.next = new SimpleLinkedListNode(value);
            tail = tail.next;
        }
    }

    @Override
    public T remove() throws Exception {
        T result = element();
        if (count() == 1) {
            tail = null;
        }
        head = head.next;
        return result;
    }

    @Override
    public T element() throws Exception {
        if (count() == 0) {
            throw new Exception("Queue is empty");
        }
        return head.value;
    }

    @Override
    public int count() {
        int size = 0;
        SimpleLinkedListNode curr = head;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        return size;
    }

    @Override
    public boolean empty() {
        return count() == 0;
    }
    @Override
    public Integer max(){
        SimpleLinkedListNode curr = head;
        Integer max =(Integer) curr.value;
        curr = curr.next;
        while (curr != null) {
            if ((Integer) curr.value > max) max =(Integer) curr.value;
            curr = curr.next;
        }
        return max;
    }

    @Override
    public Integer min(){
        SimpleLinkedListNode curr = head;
        Integer min = (Integer) curr.value;
        curr = curr.next;
        while (curr != null) {
            if ((Integer) curr.value < min) min =(Integer) curr.value;
            curr = curr.next;
        }
        return min;
    }

    @Override
    public String toStr() {
        SimpleLinkedListNode curr = head;
        StringBuilder sb = new StringBuilder();
        while (curr != null){
            sb.append(curr.value).append(" ");
            curr = curr.next;
        }
        return sb.toString();
    }

}
