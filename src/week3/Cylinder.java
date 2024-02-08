package week3;

public class Cylinder
{
    private Circle base;
    private int depth;

    public Cylinder(Circle base, int depth) {
        this.base = base;
        this.depth = depth;

    }

    public double calVolume() {
        return base.calArea() * depth;
    }

    public String toString() {
        return "Cylinder with base of " + base + " and depth of " + depth;
    }

    public static void main(String[] args) {

        Circle c1 = new Circle(7);
        System.out.println("Area of C1 is " + c1.calArea());
        System.out.println(c1);

        System.out.println(" ");

        Cylinder cyl1 = new Cylinder(c1, 30);
        System.out.println("Volume of Cyl1 is " + cyl1.calVolume());
        System.out.println(cyl1);

    }
}
