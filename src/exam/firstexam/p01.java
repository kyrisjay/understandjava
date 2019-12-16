package exam.firstexam;

import java.util.Scanner;

public class p01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入原始数据：");
        int num = sc.nextInt();

        String result = jiaMi(num);
        System.out.println("加密后的结果：" + result);
    }

    public static String jiaMi(int num) {
        int[] arr = new int[4];
        int index = 0;
        while (num > 0) {
            arr[index] = num % 10;
            index++;
            num /= 10;
        }
        for (int i = 0; i < index; i++) {
            arr[i] += 9;
            arr[i] %= 10;
        }
        int temp = arr[0];
        arr[0] = arr[index - 2];
        arr[index - 2] = temp;

        int a = arr[1];
        arr[1] = arr[index - 1];
        arr[index - 1] = a;

        String s = "";
        for (int i = 0; i < index; i++) {
            s += arr[i];
        }
        return s;
    }
}
