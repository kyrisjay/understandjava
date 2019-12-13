package practise.extendspra;

public class Test1 {
    public static void main(String[] args) {
        new Circle();
    }
}

class Draw {
    public Draw(String type) {
        System.out.println(type + " draw constructor");
    }
}

class Shape {
    private Draw draw = new Draw("shape");

    public Shape() {
        System.out.println("shape constructor");
    }

    public static void printName() {
    }
}

class Circle extends Shape {
    private Draw draw = new Draw("circle");

    public Circle() {
        System.out.println("circle constructor");
    }
}

//shape draw constructor
//shape constructor
//circle draw constructor
//circle constructor