package practise.basicsthree;

import java.util.Scanner;

/*
请输入一个任意年份,判断是否是闰年
 */
public class JudgementOfLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入某一年份");
        int year = sc.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 10 != 0)) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
    }
}
