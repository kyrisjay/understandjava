package practise.basicsthree;

import java.util.Scanner;

/*
输入一批整数，使用循环求出最大值与最小值，输入0时结束
 */
public class MaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入整数");
        int num = sc.nextInt();
        int min;
        int max;
        min = max = num;
        while (num != 0) {
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            } else {
                System.out.println("请继续输入，输入0结束");
                num = sc.nextInt();
            }
        }
        System.out.println("最大值是"+max+"，最小值是"+min);
    }
}
