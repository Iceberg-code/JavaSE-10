package cn.itcast.day10.demo04;

import javax.swing.*;

public class Demo01GenericConclusion {
    public static void main(String[] args) {
        MyClass<String> t1 = new MyClass<>();
        t1.method("源氏");

        MyClass<Integer> t2 = new MyClass<>();
        t2.method(1);
        System.out.println("================");

        MyInterImpl<String> impl1 = new MyInterImpl<>();
        impl1.method("半藏");
        MyInterImpl<Double> impl2 = new MyInterImpl<>();
        impl2.method(1.0);  //写1就会报错，写1.0不会报错。

    }
}
