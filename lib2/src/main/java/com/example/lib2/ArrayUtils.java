package com.example.lib2;

/**
 * @Author Coco
 * @ClassName ArrayUtils
 * @Date 2020/6/16 14:40
 * @Description TODO
 */
public class ArrayUtils {
    public static void main(String[] args) {
        int[] arr = {19, 29, 3, 35, 209};
//        ArrayTool arrayTool = new ArrayTool();
//        int max = arrayTool.getMax(arr);
//        System.out.println(max);
        int max2 = ArrayTool.getMax2(arr);
        System.out.println(max2);
        ArrayTool.print(arr);

        ArrayTool.revert(arr);
        ArrayTool.print(arr);

    }
}

class ArrayTool {

    //注意：如果一个类中所有的方法都是静态的，需要多做一步，
    // 私有构造方法，目的是不让其他类创建本类对象


    /**
     * 私有东西，只能内部用，外部不给用
     */
    private ArrayTool(){

    }

    /**
     * 获取数组最大值
     * <p>
     * 比较耗性能
     *
     * @param arr
     * @return
     */
    int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static int getMax2(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 遍历数组
     *
     * @param arr
     */
    static void print(int arr[]) {
        System.out.println("========数据打印开始=========");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("========数据打印结束=========");
    }

    /**
     * 反转
     */
    static void revert(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            int left = i;
            int right = arr.length - i - 1;
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
    }
}