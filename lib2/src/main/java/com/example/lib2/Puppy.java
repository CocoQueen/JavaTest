package com.example.lib2;

/**
 * @Author Coco
 * @ClassName Puppy
 * @Date 2020/6/9 10:41
 * @Description TODO
 */
public class Puppy {
    int puppyAge;

    public Puppy() {
    }

    public Puppy(String name) {
        // 这个构造器仅有一个参数：name
        System.out.println("小狗的名字是 :" + name);
    }

    public void setAge( int age ){
        puppyAge = age;
    }

    public int getAge(){
        System.out.println("小狗的年龄为 : " + puppyAge );
        return puppyAge;
    }
}