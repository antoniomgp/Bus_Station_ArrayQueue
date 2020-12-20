package com.company;

public interface Queue<T> {
    void enqueue(T o);
    T front();
    T dequeue();
    int size();
    boolean empty();
}
