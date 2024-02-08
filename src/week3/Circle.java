package week3;

public class Circle
{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;

    }

    public double calArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return "Circle with radius " + radius;
    }

}
