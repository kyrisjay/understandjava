package practise.javapra4;

public class rectangularSon extends rectangular {
    private double height;

    public rectangularSon() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void volume() {
        System.out.println("体积是="+getLength() * getWidth() * height);
    }
}
