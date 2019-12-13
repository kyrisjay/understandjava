package practise.objectPra;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Object {
    /*
            1.将 byte [] by={65,67,68,97,98,101}  转换成字符串输出
            将上诉字节数组  从指定的位置开始到结束转换成字符串输出
            2.同样的自定义一个字符数组用字符串的方式输出
            3."abcdw" "ABCDw" 比较两个字符串是否相等  忽略大小写
            4."我是你的谁,我是你的剑" 判断是否包含 "剑"
            5.第四题字符串判断是否以"我开头",判断是否以"剑"结尾
            6.String   str=""和 String  str2=null; 判断他们是否为空
            7.找到此字符串"我是你的小宝贝"的 "我" 进行输出
            8.找出 "我是你的谁,我是你的剑" 里面的 "你" 第一次出现的位置
            9.找到上面 8 题的 最后一次出现 "你" 的位置,然后再从 第4个位置开始找  第一次出现的"你"
            10."我是你的谁,我是你的剑"  从指定位置开始截取长度;从指定位置开始截取到指定位置结束长度的字符串
            11." 我是你的谁,我是你的剑 " 去除字符串左右空格
            12. "我是你的谁,我是你的剑"  替代字符串里面的"谁",改为"被子"
            13."我是你的谁,我是你的剑"  替换该字符串的所有的 "你" 改为 "哈"
            14. 比较 "avabc" 和 "avab" 字符串
            15. 将字符数组转换成 字符串输出
            16. 将字节数组以指定的编码格式转换成字符串，再转换后的字符串以指定的编码格式转换成字节数组
         */
    public static void main(String[] args) {
        byte [] by={65,67,68,97,98,101};
        String a=new String(by);
        System.out.println(a);

        char [] ch={'a','b','c'};
        String b=new String(ch);
        System.out.println(b);

        String str="abcdw";
        String str2="ABCDw";
        System.out.println(str.compareToIgnoreCase(str2));//比较字符串是否相等  忽略大小写

        String str3="我是你的谁,我是你的剑";
        System.out.println(str3.contains("剑"));
        //contains 如果并且只有当此字符串包含指定的字符序列的字符串值，则返回真值
        System.out.println(str3.startsWith("我"));//判断以什么开头
        System.out.println(str3.endsWith("剑"));//判断以什么结尾

        String   str4="";
        String   str5=null;
        System.out.println(str4.isEmpty());
//        System.out.println(str5.isEmpty());

        String str6="我是你的小宝贝";
        System.out.println(str6.charAt(0));

        String str7="我是你的谁,我是你的剑";
        System.out.println(str7.indexOf("你"));
        System.out.println(str7.lastIndexOf("你"));
        System.out.println(str7.indexOf("你",4));

        String str8="我是你的谁,我是你的剑";
        System.out.println(str8.substring(3,6));
        System.out.println(str8.trim());
        System.out.println(str8.replaceFirst("谁","被子"));
        System.out.println(str8.replaceAll("你","哈"));

        String str9="avabc";
        String str10="avab";
        System.out.println(str9.compareTo(str10));

        byte [] ch1={'a','b','c'};
        String ch2=new String(ch1);
        System.out.println(ch2);

        byte [] ch4=ch2.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(ch4));

    }
}
