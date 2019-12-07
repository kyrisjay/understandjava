package practise.javaPra7;

import java.util.Scanner;

/*
从键盘输入某个十进制整数数，转换成对应的二进制整数并输出
 */
public class p02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入十进制整数数");
        int num=sc.nextInt();
        System.out.println("十进制转二进制"+Integer.toBinaryString(num));
    }
}
