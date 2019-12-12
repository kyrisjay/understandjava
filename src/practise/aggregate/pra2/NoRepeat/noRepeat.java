package practise.aggregate.pra2.NoRepeat;

import java.util.HashSet;
import java.util.Scanner;

public class noRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符：");
        //创建HashSet对象 将字符串存储，自动去掉重复
        HashSet<Character> ch = new HashSet<>();
        String line = sc.nextLine();//nextLine() 可以得到带空格的字符串，next()不能
        char[] arr = line.toCharArray();

        for (Character c : arr) {   //遍历字符串数组
            ch.add(c);
            System.out.print(c);
        }

        for (Character c2 : ch) { // 遍历HashSet，打印字符
            System.out.print(c2);
        }
    }
}
