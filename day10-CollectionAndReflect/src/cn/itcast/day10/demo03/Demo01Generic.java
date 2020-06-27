package cn.itcast.day10.demo03;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Generic {
    public static void main(String[] args) {
//        demo01();
        demo02();
    }

    /*
    * 创建集合对象不使用泛型
    *   好处：
    *       集合不使用泛型，默认的类型就是Object类型，可以存储任意类型的数据
    *   弊端：
    *       集合不安全，会引发异常
    * */
    private static void demo01(){
        ArrayList list = new ArrayList();   //没有写<>泛型，不写默认类型就是Object
        list.add("abc");
        list.add(123);

        //使用迭代器遍历list集合
        //获取迭代器
        Iterator it = list.iterator();
        //使用迭代器中hasNext和next方法遍历集合
        while (it.hasNext()){
            //取出的元素也是Object类型
            Object obj = it.next();
            System.out.println(obj);

            //想要使用String类的特有方法，length获取字符串的长度，不能使用。因为是多态，不能使用子类特有的方法 - Object obj = "abc"
            //需要进行向下转型
            //会抛出ClassCastException - 类型转换异常，不能把Integer类型转换为String类型
            String str = (String) obj;
            int length = str.length();
            System.out.println(length);
        }
    }

    /*
    * 创建集合对象，使用泛型
    *   好处：
    *       1、避免了类型转换的麻烦，存储的是什么类型，取出的就是什么类型
    *       2、把运行期异常（代码运行之后会抛出的异常），提升到了编译期（写代码的时候会报错）
    *   弊端：
    *       泛型是什么类型，就只能存储什么类型的数据
    * */
    private static void demo02(){
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");

        //使用迭代器遍历list集合
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
            System.out.println(str.length());
        }
    }
}
