package practise.loopandarray;

import java.util.Scanner;

/*
  定义一个长度为10的整型数组，循环输入10个整数。 然后将输入一个整数，查找此整数，找到 输出下标，没找到给出提示。
 */
public class LoopArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("请输入第" + (i + 1) + "个数");
            arr[i] = sc.nextInt();
        }
        System.out.println("请输入要查找的数");
        boolean b= false;
        int num = sc.nextInt();
        for (int j = 0; j < 10; j++) {
            if (num == arr[j]) {
                b=true;
                System.out.println(num + ",下标为：" + j);
            }
        }
        if(!b){
            System.out.println("没有该数");
        }
    }
}