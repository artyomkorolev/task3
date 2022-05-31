package ru.vsu.cs.cource1;

public interface SimpleQueue<T> {
    void add(T value);
    T remove() throws Exception;
    T element() throws Exception;
    int count();
    boolean empty();
    Integer max();
    Integer min();
    String toStr();

}