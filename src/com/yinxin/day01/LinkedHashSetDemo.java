package com.yinxin.day01;

import java.util.HashSet;
import java.util.LinkedHashSet;

//底层是hash表(数组+链表/红黑树) +链表(维护顺序) 他是有序的
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("www");
        hashSet.add("www2");
        hashSet.add("www3");
        hashSet.add("www3");
        hashSet.add("www4");
        hashSet.add("www5");
        hashSet.add("www6");
        System.out.println(hashSet); //无序
        /*------------------------华丽的分割线----------------------------*/
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("www5");
        linkedHashSet.add("www2");
        linkedHashSet.add("www3");
        linkedHashSet.add("www3");
        linkedHashSet.add("www4");
        linkedHashSet.add("www5");
        linkedHashSet.add("www6");
        System.out.println(linkedHashSet); //有序
    }
}
