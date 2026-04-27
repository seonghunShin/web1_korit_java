package _14_Inheritance.shape;

public class Shape {

    protected int width;
    protected int height;
    // 면적을 구하는 메서드

    public Shape() {
        System.out.println("부모의 기본생성자 호출!");
    }

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return 0;
    }
}
