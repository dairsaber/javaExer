package com.yinxin.day01;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;

public class CollectionsToolDemo {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();

		// 一次性添加多个元素
		Collections.addAll(arrayList, "a", "b", "c", "d");
		System.out.println(arrayList);

		// 打乱集合元素顺序
		Collections.shuffle(arrayList);
		System.out.println(arrayList);

		/*-----------------------*/

		ArrayList<Integer> intArray = new ArrayList<>();
		Collections.addAll(intArray, 215, 1, 5, 15, 145, 955, 65, 56, 12, 5);
		System.out.println("排序之前===>" + intArray);

		// 按照默认顺序排序(升序)
		Collections.sort(intArray);
		System.out.println("排序之后===>" + intArray);

		// 字符串排序
		Collections.sort(arrayList);
		System.out.println("字符串排序===>" + arrayList);

		// 排序自定义类 在类中实现Comparable接口中的CompareTo
		ArrayList<Person> personList = new ArrayList<>();
		Collections.addAll(personList, new Person("yinxinp", 33), new Person("yixniny", 4),
				new Person("zhoucheng", 30));
		System.out.println("person 排序之前===>" + personList);

		// 根据年龄排序
		Collections.sort(personList);
		System.out.println("person 排序之后===>" + personList);

		// 第二种排序实现 通过排序方法实现
		/**
		 * 将intArray 降序排序
		 */
		Collections.sort(intArray, (o1, o2) -> o2 - o1); // lambda表达式

		System.out.println("intArray 降序排序===>" + intArray);

	}
}
