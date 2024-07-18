public class Wrapperclasses {
    public static void main(String[] args) {
        // Autoboxing: converting primitive to Wrapper class
        int primitiveInt = 5;
        Integer wrapperInt = primitiveInt; // Autoboxing

        // Unboxing: converting Wrapper class to primitive
        Integer anotherWrapperInt = new Integer(10);
        int anotherPrimitiveInt = anotherWrapperInt; // Unboxing

        // Display the values
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapper Integer: " + wrapperInt);
        System.out.println("Another Wrapper Integer: " + anotherWrapperInt);
        System.out.println("Another Primitive int: " + anotherPrimitiveInt);
    }
}
