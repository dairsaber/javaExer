package com.yinxin.day01;

import java.util.ArrayList;

public class UnknownTypeCollectionDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list01 = new ArrayList<>();
		list01.add(1);
		list01.add(2);
		list01.add(3);
		list01.add(4);
		ArrayList<String> list02 = new ArrayList<>();
		list02.add("1aaa");
		list02.add("2xxx");
		list02.add("3dddd");
		list02.add("4ddd");

		showList(list01);
		showList(list02);
	}

	// 泛型通配符? 只能用于函数的参数使用
	private static void showList(ArrayList<?> list) {
		System.out.println(list);
	}
}
