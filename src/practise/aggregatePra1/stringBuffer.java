package practise.aggregatePra1;

public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("132");
        str.append("abcdefghigklmnopqrstuvwxyz");
        System.out.println(str.reverse());
        System.out.println(str.delete(0,5));
    }
}
