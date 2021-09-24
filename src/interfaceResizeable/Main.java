package interfaceResizeable;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape square = new Square(6);
        Shape[] listShape = {circle, rectangle, square};
        double a = Math.floor(Math.random()*99)+1;
        for (int i = 0; i < listShape.length; i++) {
            System.out.println(listShape[i].getArea());
        }
        for (int i = 0; i < listShape.length; i++) {
            listShape[i].resize(a);
        }
        for (int i = 0; i < listShape.length; i++) {
            System.out.println(listShape[i].getArea());
        }
    }
}
