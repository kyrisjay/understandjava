package practise.loopandarray;

import java.util.Scanner;

/*
输入10个整数存入数组，然后复制到b数组中输出
*/
public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] b = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("请输入第" + (i + 1) + "个整数");
            int num = sc.nextInt();
            arr[i] = num;
            b[i] = arr[i];
        }
        System.out.println("复制到b数组:");
        for (int j = 0; j < 10; j++) {
            System.out.print(b[j] + " ");
        }
    }
}
