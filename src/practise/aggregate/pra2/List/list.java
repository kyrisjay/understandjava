package practise.aggregate.pra2.List;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class list {
    public static void main(String[] args) {
        LinkedList<String> ch=new LinkedList<>();
        ch.add("apple");
        ch.add("grape");
        ch.add("banana");
        ch.add("pear");

        System.out.println("最大的元素："+ Collections.max(ch));
        System.out.println("最小的元素："+ Collections.min(ch));

        Collections.sort(ch);
        for(String str:ch){
            System.out.print(str+" ");
        }

    }
}
