package cn.itcast.day10.demo03;
/*
* 含有泛型的接口，第一种使用方式：定义接口的实现类，实现接口，指定接口的泛型
* */
public class GenericInterfaceImpl1/*<String>*/ implements GenericInterface<String> {
    //上一条语句如果“GenericInterfaceImpl1<String>”，则在Demo04GenericInterface中相关语句会出现语句变黄色
    //GenericInterfaceImpl1/*<String>*/ ， Demo04GenericInterface相关语句没有变色
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
