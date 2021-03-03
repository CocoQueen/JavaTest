package com.example.lib2;

import java.util.Scanner;

/**
 * @Author Coco
 * @ClassName Game
 * @Date 2020/6/17 10:07
 * @Description TODO
 */
public class Game {
    public static void main(String[] args) {
//        int num = 0;
//        while (true) {
//            num = (int) (Math.random() * 100);
//            if (num != 0) break;
//        }

        String s = "123456";

        StringBuffer stringBuffer = new StringBuffer(s);
        StringBuffer reverse = stringBuffer.reverse();
        System.out.println(reverse);

//        System.out.println("生成的随机数是：" + num);
//
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//            System.out.println("请输入1~99的随机数");
//            int a = scanner.nextInt();
//
//            if (a > num) {
//                System.out.println("大了");
//            } else if (a < num) {
//                System.out.println("小了");
//            } else {
//                System.out.println("正确");
//                break;
//            }
//        }
    }
}
