package cn.itcast.day10.demo01;

import java.util.ArrayList;
import java.util.Collection;

/*
* Collection(单列集合)       （Collection没有带索引的方法）
*
* java.util.Collection接口：
*       所有单列集合的最顶层接口，里面定义了所有单列集合共性的方法
*       任意的单列集合都可以使用Collection接口中的方法
*
* 共性方法：
*       public boolean add(E e)：把给定的对象添加到当前集合中
*       public void clear()：清空集合中所有元素
*       public boolean remove(E e)：把给定的对象在当前集合中删除
*       public boolean contains(E e)：判断当前集合中是否包含给定的对象
*       public boolean isEmpty()：判断当前集合是否为空
*       public int size()：返回集合中元素的个数
*       public Object[] toArray()：把集合中的元素，存储到数组中
* */
public class Demo01Collection {
    public static void main(String[] args) {
        //创建集合对象，可以使用多态
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);   //[] - 重写了toString方法

        /*
        * public boolean add(E e)：把给定的对象添加到当前集合中
        * 返回值是一个boolean值，一般都返回true，所以可以不用接收
        * */
        boolean b1 = coll.add("狂鼠");
        System.out.println(b1);  //true
        System.out.println(coll);   //[狂鼠]
        coll.add("源氏");
        coll.add("半藏");
        coll.add("卢西奥");
        coll.add("安娜");
        System.out.println(coll);   //[狂鼠, 源氏, 半藏, 卢西奥, 安娜]
        System.out.println("===================");

        /*
        * public boolean remove(E e)：把给定的对象在当前集合中删除
        * 返回值是一个boolean值，集合中存在该元素，删除元素并返回true;集合中不存在该元素，删除失败并返回false
        * */
        boolean b2 = coll.remove("卢西奥");
        System.out.println(b2); //true
        boolean b3 = coll.remove("路霸");
        System.out.println(b3); //false
        System.out.println(coll);   //[狂鼠, 源氏, 半藏, 安娜]
        System.out.println("===================");

        /*
        * public boolean contains(E e)：判断当前集合中是否包含给定的对象
        * 包含该元素，返回true;不包含该元素，返回false
        * */
        boolean b4 = coll.contains("安娜");
        System.out.println(b4); //true
        boolean b5 = coll.contains("路霸");
        System.out.println(b5); //false
        System.out.println("===================");

        /*
        * public boolean isEmpty()：判断当前集合是否为空
        * 集合为空，返回true;集合不为空，返回false
        * */
        boolean b6 = coll.isEmpty();
        System.out.println(b6); //false
        System.out.println("===================");

        /*
        * public int size()：返回集合中元素的个数
        * */
        int size = coll.size();
        System.out.println(size);   //4
        System.out.println("===================");

        /*
        * public Object[] toArray()：把集合中的元素，存储到数组中
        * */
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); //狂鼠 源氏 半藏 安娜
        }
        System.out.println();
        System.out.println("===================");

        /*
        * public void clear()：清空集合中所有元素
        * 但是不删除集合，集合还存在
        * */
        coll.clear();
        System.out.println(coll);   //[]
        System.out.println(coll.isEmpty()); //true
    }
}
