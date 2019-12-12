package practise.aggregate.pra1;

public class stringTest {
    public static void main(String[] args) {
        String  s="aafdsafd";
        System.out.println(s.hashCode());
        s="bdfdsf";
        System.out.println(s.hashCode());
        //地址不同，string修饰的字符串不能够被改变

        StringBuffer s1=new StringBuffer("fsdsfrs");
        System.out.println(s1);
        System.out.println(s1.hashCode());
        //对原字符串进行追加
        s1.append("hhsa");
        System.out.println(s1.hashCode());
        //地址相同，StringBuffer 修饰的字符串可以改变
    }
}
