package com.example.lib2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Author Coco
 * @ClassName Demo
 * @Date 2020/6/9 17:47
 * @Description TODO
 */
public class Demo {
    public static void main(String[] args) {
        char c1 = 73;
        char c2 = 76;
        char c3 = 111;
        char c4 = 118;
        char c5 = 101;
        char c6 = 89;
        char c7 = 111;
        char c8 = 117;
        System.out.print(c1 + " ");
        System.out.print(c2);
        System.out.print(c3);
        System.out.print(c4);
        System.out.print(c5 + " ");
        System.out.print(c6);
        System.out.print(c7);
        System.out.print(c8);

        double d = 0.4;
        double d1 = 0.49;
        double d2 = 0.35;
        double d4 = 0.40;
        double dd=d + d1 + d2 + d4;
        String format = new DecimalFormat("0.00").format(dd);
        System.out.println(format);

        //键盘录入
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println("请输入一个数:");
        System.out.println("i=" + i);

    }
}
