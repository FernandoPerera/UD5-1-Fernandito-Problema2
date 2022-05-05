package com.nandosoft.utils;

public class CustomQueue {
    private static final int INITIAL_CAPACITY = 5;

    private CustomCollection collection = new CustomCollection(INITIAL_CAPACITY);

    public void enqueue(int number) {
        collection.add(number);
    }

    public int dequeue() {
        return (int) collection.delete(0);
    }
}

