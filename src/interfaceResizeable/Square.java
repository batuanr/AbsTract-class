package interfaceResizeable;

public class Square extends Shape implements Resizeable{
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public void resize(double a) {
        side = a;
    }
}
