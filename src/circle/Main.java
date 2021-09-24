package circle;

public class Main {
    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(5.5);
        ComparableCircle circle2 = new ComparableCircle(5);
        ComparableCircle circle3 = new ComparableCircle(6.5);
        ComparableCircle[] circles = {circle1, circle2, circle3};
        for (ComparableCircle c: circles){
            System.out.println(c);
        }
        for (int i = 0; i < circles.length-1; i++) {
            circles[i].compareTo(circles[i+1]);
        }
    }
}
