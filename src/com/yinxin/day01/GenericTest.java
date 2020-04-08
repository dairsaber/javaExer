package com.yinxin.day01;

public class GenericTest {
    public static void main(String[] args) {
        GenericInterfaceImpl<String> generic = new GenericInterfaceImpl<>();
        generic.output("我是一个测试泛型接口的方法");

        GenericInterfaceImpl<Integer> generic02 = new GenericInterfaceImpl<>();
        generic02.output(334);
    }
}
