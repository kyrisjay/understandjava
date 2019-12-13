package practise.javasePackage;

public   class  Cygnus{
    static int value = 9; //注意value是静态的成员变量
    public static void main(String[] args) throws Exception{
        new Cygnus().printValue();
    }

    private   void printValue(){
        int value = 69;
        System.out.println(this.value);
    }
}
//9   this为实例的引用    题中this.value相当于 Cygnus.value