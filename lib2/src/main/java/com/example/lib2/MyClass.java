package com.example.lib2;

public class MyClass {

    public static void main(String[] args) {
        //Hello World
        System.out.println("test");
        System.out.println("test2");
        //为果汁店设计一个程序，限制果汁为小、中、大杯
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.SMALL;
        System.out.println(juice.size);
    }

}

class FreshJuice {
    //为果汁店设计一个程序，限制果汁为小、中、大杯
    //枚举：小、中、大
    //注意：枚举可以单独声明或者声明在类里面。方法、变量、构造函数也可以在枚举中定义。

    enum FreshJuiceSize {SMALL, MEDIUM, LARGE}

    FreshJuiceSize size;
}
