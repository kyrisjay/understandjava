package exam.second;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrNestingHmp {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        HashMap<String, String> hm = new HashMap<>();
        hm.put("周瑜", "小乔");
        hm.put("吕布", "貂蝉");
        al.add(hm);

        HashMap<String, String> hm1 = new HashMap<>();
        hm1.put("郭靖", "黄蓉");
        hm1.put("杨过", "小龙女");
        al.add(hm1);

        HashMap<String, String> hm2 = new HashMap<>();
        hm2.put("令狐冲", "任盈盈");
        hm2.put("林平之", "岳灵珊");
        al.add(hm2);


        for (Object s2 : al) {
            System.out.println(s2);
        }
    }
}
