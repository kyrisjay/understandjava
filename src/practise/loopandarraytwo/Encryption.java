package practise.loopandarraytwo;

import java.util.Scanner;

/*
数据加密问题
		某个公司采用公用电话传递数据信息，数据是小于8位的整数(默认8位)，为了确保安全，
		在传递过程中需要加密，加密规则如下：
			首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字， 87654321   8+5=13%10=3
			最后将第一位和最后一位数字交换。 请任意给定一个小于8位的整数，
			然后，把加密后的结果在控制台打印出来
 */
public class Encryption {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入原始数据：");
        int num = sc.nextInt();

        String result = jiaMi(num);
        System.out.println("加密后的结果：" + result);
    }

    public static String jiaMi(int num) {
        int[] arr = new int[8];
        int index = 0;
        while (num > 0) {
            arr[index] = num % 10;
            index++;
            num /= 10;
        }
        for (int i = 0; i < index; i++) {
            arr[i] += 5;
            arr[i] %= 10;
        }
        int temp = arr[0];
        arr[0] = arr[index - 1];
        arr[index - 1] = temp;

        String s = "";
        for (int i = 0; i < index; i++) {
            s += arr[i];
        }
        return s;
    }
}
