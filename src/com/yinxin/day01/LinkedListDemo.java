package com.yinxin.day01;

import java.util.LinkedList;

/**
 *  LinkedList 底层采用链表数据结构
 *  效果就是增删快,查询慢
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("XXXX");
        linked.addFirst("123");
        linked.push("xxxxdd");
        linked.removeFirst();
        //....
        System.out.println(linked);
    }
}
