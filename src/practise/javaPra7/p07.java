package practise.javaPra7;

import java.util.Scanner;

/*
7.输入一个正整数，将该数的各位左右反转输出，即输入123，输出321。（使用while循环实现）
 */
public class p07 {
    public static void main(String[] args) {
        int i;
        int num1 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int num = sc.nextInt();
        if (num > 0 && num < 10) {
            System.out.println(num);
        } else {
            while (num > 0) {
                i = num % 10;
                num = num / 10;
                num1 = num1 * 10 + i;
            }
            System.out.println(num1);
        }
    }
}
