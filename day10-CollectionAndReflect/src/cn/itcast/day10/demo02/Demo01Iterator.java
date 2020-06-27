package cn.itcast.day10.demo02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
* java.util.Iterator接口：迭代器（对集合进行遍历）
* 有两个常用的方法：
*       boolean hasNext()：如果仍有元素可以迭代，则返回true
*           判断集合中还有没有下一个元素，有就返回true，没有就返false
*       E next()：返回迭代的下一个元素
*           取出集合中的下一个元素
* Iterator迭代器是一个接口，无法直接使用，需要使用Iterator接口的是实现类对象，获取实现类的方式比较特殊
* Collection接口中有一个方法，叫iterator()，这个方法返回的就是迭代器的实现类对象
*       Iterator<E> iterator()：返回在此collection的元素上进行迭代的迭代器
*
* 迭代器的使用步骤：
*       1、使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator()接口接收（多态）
*       2、使用Iterator接口中的方法hasNext判断还有没有下一个元素
*       3、使用Iterator接口中的方法next取出集合中的下一个元素
* */
public class Demo01Iterator {
    public static void main(String[] args) {
        //创建一个集合对象
        Collection<String> coll = new ArrayList<>();
        //往集合中添加元素
        coll.add("狂鼠");
        coll.add("安娜");
        coll.add("源氏");
        coll.add("半藏");
        coll.add("麦克雷");

        /*
        * 1、使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator()接口接收（多态）
        * 注意：
        *       Iterator<E>接口也是有泛型的，迭代器的泛型跟着集合走，集合是什么泛型，迭代器就是什么泛型
        * */
        //多态：   接口          实现类对象
        Iterator<String> it = coll.iterator();

//        /*
//        * 2、使用Iterator接口中的方法hasNext判断还有没有下一个元素
//        * */
//        boolean b = it.hasNext();
//        System.out.println(b);  //true
//
//        /*
//        * 3、使用Iterator接口中的方法next取出集合中的下一个元素
//        * */
//        String s = it.next();
//        System.out.println(s);  //狂鼠
//
//        b = it.hasNext();
//        System.out.println(b);  //true
//        s = it.next();
//        System.out.println(s);  //安娜
//
//        b = it.hasNext();
//        System.out.println(b);  //true
//        s = it.next();
//        System.out.println(s);  //源氏
//
//        b = it.hasNext();
//        System.out.println(b);  //true
//        s = it.next();
//        System.out.println(s);  //半藏
//
//        b = it.hasNext();
//        System.out.println(b);  //true
//        s = it.next();
//        System.out.println(s);  //麦克雷
//
//        b = it.hasNext();
//        System.out.println(b);  //false - 没有元素返回false
//        s = it.next();  //没有元素，再去除元素会抛出NoSuchElementException - 没有元素异常
//        System.out.println(s);

        /*
         * 发现使用迭代器取出集合中元素的代码，是一个重复的过程
         * 所以可以使用循环优化
         * 不知道集合中有多少元素，使用while循环
         * 循环结束的条件，hasNext方法返回false
         * */
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("=============");

        for(Iterator<String> it2 = coll.iterator(); it2.hasNext(); ){   //不用写步进表达式，因为Next()方法既能取出表达式，也能将指针移动一位
            String s = it2.next();
            System.out.println(s);
        }
    }
}
