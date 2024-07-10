public class User {
//Fields (attributes)
    public static String name;

    //constractor for this class:is a method that called when a new instance from class is made
    public User(String name){
        this.name = name;
    }

    //Methods
    public static void sayHello(){
        System.out.println("Hello, " + name + "!");
    }
}
