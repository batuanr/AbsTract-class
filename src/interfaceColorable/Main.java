package interfaceColorable;

public class Main {
    public static void main(String[] args) {
        Shape h1 = new Square(5);
        Shape h2 = new Square(6);
        Shape h3 = new Square(7);
        Shape h4 = new Square(9);
        Shape[] listShape = {h1, h2, h3, h4};
        for (int i = 0; i < listShape.length; i++) {
            System.out.println(listShape[i].getArea());
            listShape[i].howToColor();
        }

    }

}
