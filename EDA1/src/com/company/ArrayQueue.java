package com.company;

public class ArrayQueue<T> implements Queue<T>{
    int front;
    int rear;
    int size;
    int capacity;
    T[] queue;

    public ArrayQueue(int capacity){
        this.capacity = capacity + 1;
        this.front = 0;
        this.rear = 0;
        this.size = 0;
        queue = (T[]) new Object[this.capacity];
    }


    @Override
    public void enqueue(T o) {
        try
        {
            if(size() == this.capacity - 1){
                throw new OverflowException("OVERFLOW");
            } else {
                this.queue[this.rear] = o;
                this.rear = (this.rear + 1) % this.capacity;
                size++;
            }
        } catch (OverflowException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public T front() {
        try
        {
            if(empty()){
                throw new EmptyException("Front is empty");
            } else {
                return this.queue[this.front];
            }

        } catch (EmptyException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public T dequeue() {
        try
        {
            if(empty()){
                throw new EmptyException("Queue is empty");
            } else {
                T dequeue = this.queue[this.front];
                this.queue[this.front] = null;
                this.front = (this.front + 1) % this.capacity;
                size--;
                return dequeue; }
        } catch (EmptyException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public int size() {

        return ((this.capacity - this.front + this.rear) % this.capacity);
    }

    @Override
    public boolean empty() {

        return this.front == this.rear;
    }

    @Override
    public String toString() {
        String s = "[";
        for(int i = this.front;i<=this.rear-2;i++){
            s = s + queue[i].toString()+";";
        }

        s = s + queue[this.rear-1].toString()+"]";
        return s;
    }

}
