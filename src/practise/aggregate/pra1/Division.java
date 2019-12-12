package practise.aggregate.pra1;

public class Division {
    public static void main(String[] args) {
        String str = "To be or not to be";
        String[] strNew = str.split(" ");

        for (int i = 0; i < strNew.length; i++) {
            StringBuffer str2 = new StringBuffer(strNew[i]).reverse();
            System.out.print(str2 + " ");
        }
    }
}
