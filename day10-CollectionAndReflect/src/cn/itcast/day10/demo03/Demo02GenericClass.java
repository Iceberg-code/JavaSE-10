package cn.itcast.day10.demo03;

public class Demo02GenericClass {
    public static void main(String[] args) {
        //不写泛型，默认为Object类型
        GenericClass gc1 = new GenericClass();
        gc1.setName("只能是字符串");
        Object obj = gc1.getName();
        System.out.println(obj);
        System.out.println("================");

        //创建GenericClass对象，泛型使用Integer类型
        GenericClass<Integer> gc2 = new GenericClass<>();   //创建对象的时候确定泛型的数据类型
        gc2.setName(1);
        Integer name = gc2.getName();   //也可以用int类型来接收
        System.out.println(name);
        System.out.println("================");

        //创建GenericClass对象，泛型使用String类型
        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("狂鼠");
        String name1 = gc3.getName();
        System.out.println(name1);

//        gc3.setAge(10);
//        System.out.println(gc3.getAge());
    }
}
