package Task2;

public class Rectangle {
    private double sideA;
    private double sideB;

    public Rectangle(final double sideA, final double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return this.sideA;
    }
    public double getSideB() {
        return this.sideB;
    }
    public void setSideA(final double sideA) {
        this.sideA = sideA;
    }
    public void setSideB(final double sideB) {
        this.sideB = sideB;
    }

    public double getCircumference() {
        return 2 * this.sideA + 2 * this.sideB;
    }
    public double getArea() {
        return this.sideA*this.sideB;
    }
    public boolean isSquare() {
        return this.sideA==this.sideB;
    }

    public void printRectangle() {
        System.out.println("The circumference of the rectangle is "+getCircumference()+" and the area is "+getArea());
    }

}

