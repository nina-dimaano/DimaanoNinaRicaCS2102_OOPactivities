public class Main {
    public static void main(String[] args) {
        Square square = new Square(25);
        Rectangle rectangle = new Rectangle(30, 50);
        Triangle triangle = new Triangle(45, 55, 65);

        Shape[] shapes = { square, rectangle, triangle };
        ShapeCollection shapeCollection = new ShapeCollection(shapes);

        shapeCollection.getPropertyValues();
    }
}