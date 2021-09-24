package interfaceColorable;

public class Square extends Shape{
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }
    @Override
    public double getArea(){
        return side*side;
    }

    @Override
    public void howToColor() {
        super.howToColor();
    }
}
