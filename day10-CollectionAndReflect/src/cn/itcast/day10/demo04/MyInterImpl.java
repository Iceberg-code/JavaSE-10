package cn.itcast.day10.demo04;

public class MyInterImpl<O> implements MyInter<O> {
    @Override
    public void method(O o) {
        System.out.println(o);
    }
}
