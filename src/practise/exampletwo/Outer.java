package practise.exampletwo;

public class Outer {
    public static Inter method(){
        return new Inter(){
            @Override
            public void show() {
                System.out.println("HelloWorld");
            }
        };
    }
}
