package fr.mds.designpatern.facade.models;

public class ShapeMaker implements Shape{

    public Shape shape;

    public static final Shape CIRCLE = new Circle();
    public static final Shape RECTANGLE = new Rectangle();
    public static final Shape SQUARE = new Square();

    public ShapeMaker(Shape shape) {
        this.shape = shape;
    }
    public ShapeMaker() {

    }

    public void drawCircle() {
        System.out.println(CIRCLE.draw());
    }

    public void drawRectangle() {
        System.out.println(RECTANGLE.draw());
    }

    public void drawSquare() {
        System.out.println(SQUARE.draw());
    }

    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    public String draw() {
        System.out.println(shape.draw());
        return shape.draw();
    }
}
