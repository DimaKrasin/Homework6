package com.goit.homework;

public class Main {
    public static void main(String args[]) {
        MyArrayListWithCollections<Integer> myArrayListWithCollections = new MyArrayListWithCollections<>();
        myArrayListWithCollections.add(1);
        myArrayListWithCollections.add(2);
        myArrayListWithCollections.add(3);

        myArrayListWithCollections.show();

        myArrayListWithCollections.remove(1);
        myArrayListWithCollections.show();

        myArrayListWithCollections.clear();
        myArrayListWithCollections.show();
    }
}