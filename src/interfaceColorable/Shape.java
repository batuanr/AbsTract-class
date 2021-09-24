package interfaceColorable;

public abstract class Shape implements Colorable{
    private String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract double getArea();

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
