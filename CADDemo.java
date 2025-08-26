class Shape {
    int area(int side) { return side * side; }
    int area(int l, int b) { return l * b; }
    double area(double r) { return Math.PI * r * r; }
    String describe() { return "I am a generic Shape"; }
}

class Triangle extends Shape {
    double area(double base, double height) { return 0.5 * base * height; }
    @Override String describe() { return "I am a Triangle"; }
}

public class CADDemo {
    public static void main(String[] args) {
        Shape s = new Shape();
        System.out.println("Square area: " + s.area(5));
        System.out.println("Rectangle area: " + s.area(4, 7));
        System.out.println("Circle area: " + s.area(3.0));

        Triangle t = new Triangle();
        System.out.println("Triangle area: " + t.area(10.0, 6.0));
        System.out.println(t.describe());
    }
}
