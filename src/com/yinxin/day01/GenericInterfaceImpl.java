package com.yinxin.day01;

public class GenericInterfaceImpl<E>  implements  GenericInterface<E> {
    @Override
    public void output(E content) {
        System.out.println(content);
    }
}
