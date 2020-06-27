package cn.itcast.day10.demo02;

import java.util.ArrayList;

/*
* 增强for循环：底层使用的也是迭代器，使用for循环的格式，简化了迭代器的书写
* 是JDK 1.5+之后出现的新特性
* Collection<E> extends Iterable<E>：所有的单列集合（Collection）都可以使用增强for（也叫foreach）
* public interface Iterable<T>：实现这个接口允许对象称为"foreach"语句的目标
*
* 增强for循环：用来遍历集合和数组
* 格式：
*       for(集合/数组的数据类型 变量名 : 集合名/数组名){
*           System.out.println(变量名);
*       }
*
* 注意：
*       新for循环必须有被遍历的目标，目标只能是Collection或者是数组。新式for仅仅作为遍历操作出现
*       增强for循环内部原理其实是Iterator迭代器，所以在遍历的过程中，不能对集合中的元素进行增删操作
* */
public class Demo02ForEach {
    public static void main(String[] args) {
        demo01();
        System.out.println("===========");

        demo02();
    }

    //使用增强for循环遍历数组
    private static void demo01(){
        int[] arr = {1, 2, 3, 4, 5, 6};
        for(int i : arr){
            System.out.println(i);
        }
    }

    //使用增强for循环遍历集合
    private static void demo02(){
        ArrayList<String> list = new ArrayList<>();
        list.add("狂鼠");
        list.add("半藏");
        list.add("源氏");
        list.add("安娜");
        list.add("麦克雷");
        list.add("艾什");

        for(String s : list){
            System.out.println(s);
        }
    }
}
