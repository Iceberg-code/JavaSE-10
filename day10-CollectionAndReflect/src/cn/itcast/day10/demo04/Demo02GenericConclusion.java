package cn.itcast.day10.demo04;

import java.util.ArrayList;

public class Demo02GenericConclusion {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("world");
        list1.add("java");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);

        method(list1);
        method(list2);
    }

    //泛型的通配符
    public static void method(ArrayList<?> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
