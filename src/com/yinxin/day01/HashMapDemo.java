package com.yinxin.day01;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> testMap = new HashMap<>();

        testMap.put("xiaodandan", 13);
        testMap.put("xiaodandan2", 55);
        testMap.put("xiaodandan3", 12);
        testMap.put("xiaodandan3", 14);
        testMap.put("xiaodandan4", 113);
        System.out.println(testMap);

        System.out.println("remove");
        Integer removeVal = testMap.remove("xiaodandan3");
        System.out.println("移除:" + removeVal + ";Map:" + testMap);
        Integer removeVal02 = testMap.remove("xiaodandan3");
        System.out.println("移除:" + removeVal02 + ";Map:" + testMap);

        System.out.println("containsKey");
        Boolean containsKey = testMap.containsKey("heheda");
        System.out.println("是否包含key:heheda==>" + containsKey);
        Boolean containsKey02 = testMap.containsKey("xiaodandan4");
        System.out.println("是否包含key:xiaodandan4==>" + containsKey02);

        System.out.println("get");
        //这边用 包装类接受值 是为了防止空指针
        Integer target = testMap.get("xiaodandan2");
        System.out.println("获取xiaodandan2的值===>" + target);
        Integer target02 = testMap.get("xiaodandan3");
        System.out.println("获取xiaodandan3的值===>" + target02);
    }
}
