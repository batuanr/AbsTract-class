package circle;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(5.5);
        circles[1] = new Circle(5);
        circles[2] = new Circle(6.5);

        for (Circle c: circles){
            System.out.println(c);
        }
        Comparator comparator = new ComparableCircle();
        Arrays.sort(circles, comparator);

        for (Circle c: circles){
            System.out.println(c);
        }
    }
}
