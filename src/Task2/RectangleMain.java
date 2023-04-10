package Task2;

public class RectangleMain {
    public static void main(String[] args) {
        final Rectangle rectangle = new Rectangle(3.25, 5.25);

        rectangle.printRectangle();

        if (rectangle.isSquare()) {
            System.out.println("The rectangle is a square");
        }else{
            System.out.println("The rectangle is not a square");
        }

        rectangle.setSideA(5.25);
        rectangle.printRectangle();

        if (rectangle.isSquare()) {
            System.out.println("The rectangle is a square");
        }else{
            System.out.println("The rectangle is not a square");
        }
    }
}
