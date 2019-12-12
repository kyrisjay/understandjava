package practise.aggregatePra1;

public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        char a = 'a';

        for (int i = 0; i < 26; i++) {
            str.append(a);
            a = (char) (a + 1);

        }
        System.out.println(str.reverse());
        System.out.println(str.delete(0, 5));
    }
}
