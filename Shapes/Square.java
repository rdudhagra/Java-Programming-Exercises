public class Square extends Polygon {
    private double sideLength;

    public Square(double s) {
        this.sideLength = s;
    }

    public void setSideLength(double s) {
        this.sideLength = s;
    }

    public double getSideLength() {
        return this.sideLength;
    }

    public double area() {
        /* Task 3 */
        return 0; // Replace with your code
    }

    public double perimeter() {
        /* Task 4 */
        return 0; // Replace with your code
    }

    public int getNumberOfSides() {
        return 4;
    }
}