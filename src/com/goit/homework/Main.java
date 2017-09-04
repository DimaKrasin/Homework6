package com.goit.homework;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        Integer a = 123;

        MyArrayList<Object> y = new MyArrayList<>();

        y.add("hello1");
        y.add("hello2");
        y.add("hello3");

        y.remove(2);
        y.clear();

        y.add(123);
        System.out.println(y.size());
        System.out.println("Нулевой елемент : "+y.get(0).toString());

        y.show();
/*
        ArrayList<String> mas=new ArrayList<>();
        mas.add("1");
        mas.add("2");
        mas.add("3");

        mas.clear();

        System.out.println(mas.size());
        */
    }
}