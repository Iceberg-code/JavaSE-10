package cn.itcast.day10.demo03;
/*
* 定义一个含有泛型的类，模拟ArrayList集合
*
* 泛型是一个位置的数据类型，当不确定使用什么数据类型的时候，可以使用泛型
* 泛型可以接收任意的数据类型，可以使用Integer, String, Student...
* 创建对象的时候确定泛型的数据类型
* */
public class GenericClass<E> {
    private E name;

//    private int age;
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
