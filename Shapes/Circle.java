public class Circle extends Shape {
    // We declare Circle public because we want people to use it. There are certain cases for
    // using private classes, which would only be available in the same file. Note that it is
    // convention to capitalize class names (so MyClass is ok, but myClass is not). The name
    // of this class also matches the name of the file that it is in. We then use the `extends` 
    // keyword to declare that Circle is a subclass of the abstract class `Shape`. Therefore,
    // we must implement the two methods required by Shape: `area` and `perimeter`.

    private double radius; // We define a variable that stores the radius of the circle
    // The `private` keyword means that the variable `radius` is only accessible
    // from inside the class. This is good for variables that store information
    // that should be kept internal to the object. It's good practice to keep variables
    // private, and use 'getters' and 'setters' to modify/read it. Note how we do not
    // initially assign `radius` a value (technically the value is `null`, which is the 
    // equivalent of saying "nothing", but for programming languages). This is okay, since
    // we assign radius a value immediately in the constructor below. If this were not the case, 
    // we need to assure that 'radius' isn't being used before we assign it to a value, or else,
    // our code could crash.

    public Circle(double r) { // This is a constructor. When you create an object from
                              // a class, you can specify some information to start with
                              // that's defined in a constructor (you can have more than
                              // one constructor). For example, this constructor takes in
                              // a variable `r` the radius to that variable. Constructors
                              // are often used to set initial values for instance variables
                              // such as in this example.
        this.radius = r;

        // So using this constructor, we could create a `Circle` as follows:
        // Circle c = new Circle(5); -> the radius of that Circle would then be 5.
    }

    public double getRadius() {
        // This is a 'getter' for the private variable `radius`. 
        // This method has the `public` keyword because we want code outside this class
        // to be able to use it.

        return this.radius; // We use the keyword `this` when we want to refer to the
                            // scope of the class itself, and not the inner scope of
                            // the method (in this case, getRadius). The `return` keyword
                            // will send back whatever value comes right after to the caller
                            // of the method. Any statements we write after the `return` call
                            // will not be run, since the `return` statement will technically
                            // end execution of the method.
    }

    public void setRadius(double r) {
        // This is a 'setter' for the private variable `radius`.
        // This method has return type `void`, because we do not need to return anything
        // back to the caller of this method. Instead, we take a new radius as input (`r`)
        // and set our private variable `radius` to the new value. Note how this is similar
        // to the constructor...
        this.radius = r;


        // Example usage:
        // Circle c = new Circle(10); -> has radius 10
        // c.setRadius(4.5); -> now, c has radius 4.5
    }

    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
        // Math is a class defined by Java with some awesome utility methods that make
        // life a bit easier. We don't need to create an object of Math because the 
        // methods and variables are `static`. You can read up on the `static` keyword at
        // https://www.geeksforgeeks.org/static-keyword-java/.
        
        // As an exercise, go to https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html.
        // This is the official reference (or Javadoc) for the Java Math class. Try finding
        // the variable `PI` and the method `pow` here, and understand what the javadocs
        // tell you about it. Javadocs are extremely helpful, as both Java-defined classes and 
        // classes that other developers write will often have javadocs explaining how to use them
        // in a similar format to the link above.
    }

    public double circumference() {
        return 2 * Math.PI * this.radius;
    }

    public double perimeter() {
        return circumference(); // We often ask for the circumference of a circle, not it's
                                // perimeter. But, we still need to implement the method
                                // `perimeter` defined in Shape. So, let's just create a
                                // method `perimeter` that satisfies this requirement, and when
                                // called, will just return the value of `circumference()`.
    }
    
}