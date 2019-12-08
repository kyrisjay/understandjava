package practise.javaPra8;

import java.util.Scanner;

/*
在一个数组中找出最大和最小值，并输出它们的位置
 */
public class p08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int max = arr[0], min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个数");
            arr[i] = sc.nextInt();

            if (max < arr[i]) {
                max = arr[i];
            }
            min=arr[0];
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("最大值为："+max+",最小值："+min);
    }
}