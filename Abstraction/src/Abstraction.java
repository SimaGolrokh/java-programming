abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
    }
}
