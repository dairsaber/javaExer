package com.yinxin.day01;

//可变参数 参数类型决定 但是个数未知就可以这样
//一个方法只能有一个可变参数
//必须在参数末尾
public class VarArgsDemo {
    public static void main(String[] args) {
        int result01 = add();
        int result02 = add(1, 2, 3, 4, 5);
        int result03 = add(1, 2, 65);
        int result04 = add(34);
        System.out.println(result01);
        System.out.println(result02);
        System.out.println(result03);
        System.out.println(result04);
    }

    /**
     * 求和
     * @param number
     * @return 结果
     */
    private static int add(int... number) {
        int result = 0;
        for (int num : number) {
            result += num;
        }
        return result;
    }

}
