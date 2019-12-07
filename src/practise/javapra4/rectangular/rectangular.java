package practise.javapra4.rectangular;

public class rectangular {
    private double length;
    private double width;

    public rectangular() {

    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void area() {
        System.out.println("面积是="+length * width);
    }
}
