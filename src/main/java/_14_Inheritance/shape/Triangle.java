package _14_Inheritance.shape;

public class Triangle extends Shape {
    public Triangle() {
        super();
    }

    public Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height * 0.5;
    }
}
