package com.yinxin.day01;

import java.util.HashSet;
//import java.util.Iterator;
import java.util.Set;

/**
 * 没有索引,不能使用普通的for循环,它 extend Collection
 * 不允许存储重复元素
 * 无序集合
 * 底层是一个hash表的结构 查询速度非常快
 */
public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(3);
        set.add(6);
        set.add(4);
        set.add(5);
        set.add(4);
        set.add(5);
        set.add(2);
        set.add(5);
        set.add(5);
        // Iterator<Integer> iterator = set.iterator();
        for (Integer i : set) {
            System.out.println(i);
        }

        //自定义类型
        HashSet<Person> personHashSet = new HashSet<>();
        personHashSet.add(new Person("dayu",23));
        personHashSet.add(new Person("dayu",23));
        personHashSet.add(new Person("dayu",24));
        personHashSet.add(new Person("ddadada",23));
        personHashSet.add(new Person("xxx",12));
        System.out.println(personHashSet);
    }
}
