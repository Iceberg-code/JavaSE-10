package cn.itcast.day10.demo03;
/*
* 测试含有泛型的方法
* */
public class Demo03GenericMethod {
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();

        /*
        * 调用含有泛型的方法method01
        * 传递什么类型，泛型就是什么类型
        * */
        gm.method01(1);
        gm.method01(2.2);
        gm.method01('中');
        gm.method01("abc");
        gm.method01(true);
        System.out.println("=================");

        gm.method02("静态方法，不建议创建对象使用");
        //静态方法，通过类名.方法名(参数) 来进行调用
        GenericMethod.method02("静态方法，建议通过类来调用");
        GenericMethod.method02('哦');
        GenericMethod.method02(1);
        GenericMethod.method02(2.2);
        GenericMethod.method02(false);

    }
}
