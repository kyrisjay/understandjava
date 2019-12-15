package practise.aggregate.pra1;

import java.util.Scanner;

public class subStringPra {
    public static void main(String[] args) {
        String str = "我爱ABC汉DEF";
        byte[] str2 = str.getBytes();

        Scanner sc = new Scanner(System.in);
        System.out.println("输入截取字节数");
        int num = sc.nextInt();

        if (str2[num - 1] > 0) {
            byte[] str3 = new byte[num];
            for (int i = 0; i < num; i++) {
                str3[i] = str2[i];
            }
            str = new String(str3);
        } else {
            if (str2[0] < 0) {
                str = "";
            }
            for (int j = num - 1; j >= 0; j--) {  //下标
                if (str2[j] > 0) {
                    byte[] str3 = new byte[j + 1]; //长度
                    for (int i = 0; i <= j; i++) {
                        str3[i] = str2[i];
                    }
                    str = new String(str3);
                    break;
                } else {
                    if ((j + 1) % 3 == 0) {
                        byte[] str3 = new byte[j + 1];
                        for (int i = 0; i <= j; i++) {
                            str3[i] = str2[i];
                        }
                        str = new String(str3);
                        break;
                    }
                }
            }
        }
        System.out.println(str);
    }
}
