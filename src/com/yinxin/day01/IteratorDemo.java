package com.yinxin.day01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("姚明");
        coll.add("休闲鞋");
        coll.add("猜猜猜");
        coll.add("vvv");
        coll.add("呃呃呃");
        coll.add("肉肉肉");
        coll.add("他天天");
        coll.add("杨宜勇");
        coll.add("uuu");
        Iterator<String> it = coll.iterator();
        boolean hasNext = it.hasNext();
        System.out.println(hasNext);
        String name = it.next();
        System.out.println(name);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("=========使用for循环迭代===========");
        for(Iterator<String> iterator =coll.iterator();iterator.hasNext();){
            String personName =  iterator.next();
            System.out.println(personName);
        }
        //增强for循环
        System.out.println("===========使用增强for循环===========");
        for(String str : coll) {
            System.out.println(str);
        }
    }
}
