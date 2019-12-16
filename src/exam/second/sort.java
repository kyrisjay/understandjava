package exam.second;

import java.util.*;

public class sort {
    public static <s> void main(String[] args) {
        System.out.println("请输入若干个单词");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        List<String> ch = Arrays.asList(s);


        Collections.sort(ch, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        System.out.println(ch);
    }
}

