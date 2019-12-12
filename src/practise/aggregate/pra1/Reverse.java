package practise.aggregate.pra1;

public class Reverse {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("helloWorld");
        StringBuffer str2 = new StringBuffer(str.substring(3, 5)).reverse();
        String str3 = new String(str2);
        System.out.println(str.replace(3, 5, str3));
    }
}
