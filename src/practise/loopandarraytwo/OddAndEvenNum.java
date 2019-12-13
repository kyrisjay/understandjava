package practise.loopandarraytwo;

import java.util.Scanner;

/*
你的程序要读入一系列正整数数据，输入-1表示输入结束，-1本身不是输入的数据。程序输出读到的数据中的奇数和偶数的个数。
	输入格式:一系列正整数，整数的范围是（0,100000）。如果输入-1则表示输入结束。
	输出格式：两个整数，第一个整数表示读入数据中的奇数的个数，第二个整数表示读入数据中的偶数的个数。两个整数之间以空格分隔。
 */
public class OddAndEvenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, j = 0;
        System.out.println("请输入正整数：");
        int num = sc.nextInt();
        while (num != -1) {
            if (num <= 0) {
                System.out.println("输入错误");
            } else {
                if (num % 2 == 0) {
                    System.out.println("这是偶数");
                    i++;
                } else {
                    System.out.println("这是奇数");
                    j++;
                }
            }
            System.out.println("请输入正整数： ");
            num = sc.nextInt();
        }
        System.out.println("奇数个数：" + j + "个，偶数个数：" + i + "个");
    }
}
