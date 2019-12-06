package practise.JavaPra2;

import java.util.Scanner;

//给定一个任意的大写字母A~Z，转换为小写字母
public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输人一个大写字母");
        char num1 = sc.next().charAt(0);

        char num2 = (char) (num1 + 'a' - 'A');
        System.out.println(num2);
    }
}
