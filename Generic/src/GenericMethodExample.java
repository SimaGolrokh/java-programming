public class GenericMethodExample {//defined within a class with a type parameter before the return type

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Hello", "Generics"};

        System.out.print("Integer Array: ");
        printArray(intArray);

        System.out.print("String Array: ");
        printArray(stringArray);
    }
}
