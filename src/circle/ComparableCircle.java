package circle;

public class ComparableCircle extends Circle implements Comparable{

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }

    @Override
    public String toString() {
        return "ComparableCircle radius " + getRadius();
    }
}
