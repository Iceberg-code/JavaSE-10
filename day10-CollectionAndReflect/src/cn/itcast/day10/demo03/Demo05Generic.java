package cn.itcast.day10.demo03;

import java.util.ArrayList;
import java.util.Iterator;

/*
* 通配符基本使用：不知道使用什么类型来接收的时候，此时可以使用?，?表示未知通配符
* 注意：此时只能接收数据，不能往该集合中存储数据
* 
* 泛型的通配符：
*       ?：代表任意的数据类型
* 使用方式：
*       不能创建对象使用
*       只能作为方法的参数使用
* */
public class Demo05Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");

        //两个不同类型的集合都能够进行遍历
        printArray(list01);
        printArray(list02);


        //错误写法，泛型的通配符不能向集合中存储数据，但是可以用来进行参数的传递
//        ArrayList<?> list03 = new ArrayList<?>();

    }

    /*
    * 定义一个方法，能遍历所有类型的ArrayList集合
    * 这时候我们不知道ArrayList集合使用什么数据类型，可以用泛型的通配符?来接收数据类型
    * 注意：泛型没有继承概念！
    *   例如第43行语句：
    *   public static void printArray(ArrayList<?> list)中将ArrayList<?> list改为ArrayList<Object> list也不对！
    * */
    public static void printArray(ArrayList<?> list){
        //使用迭代器遍历集合
        //集合是什么类型，迭代器的泛型就是什么类型
        Iterator<?> it = list.iterator();
        while (it.hasNext()){
            //it.next()方法，取出的元素是Object类型，可以接收任意的数据类型
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
