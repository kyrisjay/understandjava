package practise.exampletwo.MapExample;

import java.util.TreeMap;

public class map {
    public static void main(String[] args) {
        String str = "abcabswdasaasdwd";
        //将字符串转换成字符串数组
        char[] ch = str.toCharArray();

        TreeMap<Character, Integer> treeMap = new TreeMap<Character, Integer>();
        //遍历数组
        for (int i = 0; i < ch.length; i++) {
            Integer count = treeMap.get(ch[i]);
            if (count == null) {
                treeMap.put(ch[i], 1);
            } else {
                treeMap.put(ch[i], count + 1);
            }
        }

//        //定义字符串缓冲区变量
//        StringBuilder str1 = new StringBuilder();
//        //遍历集合，得到键和值，进行拼接
//        Set<Character> set = treeMap.keySet();
//        for (Character key : set) {
//            Integer value = treeMap.get(key);
//            str1.append(key).append("(").append(value).append(")").append("\n");
//
//        }
        for (int i = 0; i < treeMap.size(); i++) {
            System.out.print(ch[i] + "(" + treeMap.get(ch[i]) + ")");
        }
    }
}
