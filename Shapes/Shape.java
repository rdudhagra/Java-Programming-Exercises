public abstract class Shape { // The abstract keyword makes this class abstract
    public abstract double area(); // All methods in an abstract class should be abstract as well
                                   // Note that we do not define a method body in an abstract 
                                   // method (no {}).
    public abstract double perimeter();

    // Essentially, the Shape class serves as a 
    // template for other shapes, mainly the classes that will extend it. 
    // We don't implement these methods, because we don't know how to find
    // the area of some random blob. However, all shapes have an area and 
    // perimeter, so we require any subclass of Shape to implement these methods.
}