public class Triangle {

    static int numOfSides = 3;

    // non static variable, instance variables
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;
    //constructor
    public Triangle(double base, double height, double sideLenOne, double sideLenTwo, double sideLenThree ) {
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;

    }
    //a Method or a behavior of our class.
    // instance method are not static
    //for using a non-static method we need to have an instant of that class.
    //the Math Methods like .pow() are static ,they can call without having an instant
    public double findArea() {
        return (this.base * this.height)/2;
    }

}
