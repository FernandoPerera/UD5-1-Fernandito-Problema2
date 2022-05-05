package com.nandosoft.utils;

public class CustomCollection {

    //Las constantes suelen ser static
    static final int DEFAULT_CAPACITY = 5;
    private Object data[] = null;
    private int length = 0;

    public CustomCollection(int initialCapacity) {
        data = new Object[initialCapacity];
    }

    public CustomCollection() {
        data = new Object[DEFAULT_CAPACITY];
    }

    public Object getElement(int position) {
        return data[position];
    }

    public int lenght() {
        return length;
    }

    public void insert(Object element, int position) {

        if(length == data.length) {
            Object []aux = data;
            data = new Object[data.length * 2];

            for (int i = 0; i < aux.length; i++) {
                data[i] = aux[i];
            }
            aux = null;
        }

        for (int i = length - 1; i >= position; i--) {
            data[i + 1] = data[i];
        }

        data[position] = element;
        length++;
    }

    public void add(Object element) {
        insert(element, length);

    }

    public int search(Object element) {
        for (int i = 0; i < length; i++) {
            if (data[i].equals(element)){
                return i;
            }
        }


        return -1;
    }

    public Object delete(int position) {
        Object aux = data[position];

        for (int i = position; i < length - 1; i++) {
            data[i] = data[i + 1];
        }

        length--;
        return aux;
    }

    @Override
    public String toString() {
        
        String output = "";

        if (length > 0){
            for (int i = 0; i < length; i++) {
                output += i + " - [" + data[i].toString() + "]\n";
            }
            return output;
        }else {
            return "<Empty>";
        }
    }
}