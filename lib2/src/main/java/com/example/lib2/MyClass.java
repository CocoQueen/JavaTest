package com.example.lib2;

import java.util.Scanner;

public class MyClass {

    /** java语言的主要特性：
     * 1、简单：
     * 2、面向对象：
     * 3、分布式：
     * 4、健壮：
     * 5、安全：
     * 6、体系结构中立：
     * 7、可移植：
     * 8、解释型：
     * 9、高性能：
     * 10、多线程：
     * 11、动态
     * */

    /* 这是一个Java程序
     * 它将打印Hello World
     * 这是一个多行注释示例
     * */

    //这是单行注释示例

    /*这个也是单行注释示例*/

    /**
     * Java空行：空白行或者有注释的行，Java编译器都会忽略掉
     * 继承：被继承的称超类，派生类称子类
     * 封装：
     * 多态：
     */

    /**
     * long(8)与float(4)的取值范围谁大谁小？
     * float的计算值方式与long类型不一样
     * float=（-1）^s*M*2^E,E可以取到127
     * long的最大值2^63-1,float的指数比long大，所以float的取值范围大
     */

    public static void main(String[] args) {
        //Hello World
        System.out.println("Hello World");
        System.out.println("你好 世界");


        //为果汁店设计一个程序，限制果汁为小、中、大杯
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.SMALL;
        System.out.println(juice.size);

        //创建对象
        Puppy puppy = new Puppy("tommy");
        //通过方法来设定age
        puppy.setAge(2);
        //调用另一个方法获取age
        int age = puppy.getAge();
        System.out.println(age);
        //访问成员变量
        System.out.println("变量值 : " + puppy.puppyAge);

    }

}

class FreshJuice {
    //为果汁店设计一个程序，限制果汁为小、中、大杯
    //枚举：小、中、大
    //注意：枚举可以单独声明或者声明在类里面。方法、变量、构造函数也可以在枚举中定义。

    enum FreshJuiceSize {SMALL, MEDIUM, LARGE}

    FreshJuiceSize size;
}
