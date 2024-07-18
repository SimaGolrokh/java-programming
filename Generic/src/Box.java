public class Box<T> {//A generic class is defined with a type parameter inside angle brackets <>.
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(10);
        System.out.println("Integer Value: " + integerBox.getValue());

        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello Generics");
        System.out.println("String Value: " + stringBox.getValue());
    }
}
