
public class Point implements Comparable<Point> {
    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDis(int x, int y) {
        this.x = x;
        this.y = y;
        return ((x * x) - (y * y));
    }

    @Override
    public int compareTo(Point o) {
        if (getDis(x, y) > o.getDis(x, y))
            return 1;
        else if (getDis(x, y) < o.getDis(x, y))
            return -1;
        else
            return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point bom = (Point) obj;
            return (getDis(x, y) == bom.getDis(x, y));
        } else
            return false;
    }

}