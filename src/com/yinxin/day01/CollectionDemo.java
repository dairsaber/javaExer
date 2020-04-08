package com.yinxin.day01;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> coll = new ArrayList<>(); //new HashSet<>();
        coll.add("张三");
        coll.add("李四");
        System.out.println(coll);
        System.out.println(coll.contains("张三"));
        coll.remove("李四");
        System.out.println(coll);
        System.out.println(coll.contains("李四"));
        coll.clear();
        System.out.println(coll);
        System.out.println(coll.isEmpty());
    }
}
