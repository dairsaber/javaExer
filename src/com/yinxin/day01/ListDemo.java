package com.yinxin.day01;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<String> listTest = new ArrayList<>();
        listTest.add("heheda");
        listTest.add("dadahe");
        listTest.add("dadada");
        System.out.println(listTest);
        listTest.remove(1);
        listTest.remove("heheda");
        System.out.println(listTest);

    }
}
