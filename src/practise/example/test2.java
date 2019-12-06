package practise.example;

public class test2 {
    public static void main(String[] args) {
        javaEE javaEe = new javaEE();
        javaEe.setName("老李");
        javaEe.setAge(32);
        System.out.println(javaEe.toString());
        javaEe.teach();

        javaSE se = new javaSE();
        se.setName("老周");
        se.setAge(26);
        System.out.println(se.toString());
        se.teach();
    }

}
