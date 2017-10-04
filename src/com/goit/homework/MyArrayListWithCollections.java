package com.goit.homework;

import java.util.Collection;

public class MyArrayListWithCollections<T> {

    public static int size;
    final static int ONE = 1;
    T[] Arr;

    MyArrayListWithCollections(T o) {
        size = 1;
        Arr = (T[]) new Object[size];
        Arr[0] = o;
        size =size+ONE;
    }

    MyArrayListWithCollections() {
        size = 0;
        Arr = (T[]) new Object[size];
        size =size+ ONE;
    }

    public void add(T o) {

        Object[] tmp = new Object[size-1];//0
        System.arraycopy(Arr, 0, tmp, 0, Arr.length);
        Arr = (T[]) new Object[size];//1
        System.arraycopy(tmp, 0, Arr, 0, tmp.length);

        Arr[size - 1] = o;//0
        size =size+ONE;//2
    }

    public void remove(int index){

        if (index<Arr.length&&index>=0) {
            Object[] tmp = new Object[size - 2];
            System.arraycopy(Arr, 0, tmp, 0, Arr.length-(Arr.length-index));
            if (index != Arr.length - 1) {
                System.arraycopy(Arr, index + 1, tmp, index, Arr.length - (index+1));
            }

            Arr = (T[]) new Object[size - 2];//1
            System.arraycopy(tmp, 0, Arr, 0, tmp.length);
            size = size - 1;
        }else{System.out.println("Неверный индекс");}
    }

    public void show() {
        for (Object element : Arr) {
            System.out.println(element);
        }
    }

    public void clear(){
        size = 0;
        Arr = (T[]) new Object[size];
        size =size+ ONE; //1
    }

    public int size(){
        return size-1;
    }

    public Object get(int index){
        return Arr[index];
    }


}
