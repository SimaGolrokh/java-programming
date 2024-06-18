import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //selection:if /if-else / switch
    int age = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age: ");
    age = sc.nextInt();


    if(age >= 18) {
        System.out.println("You can have a Alk drink.");
    }
    else {
        System.out.println("You can have a cola.");
    }
        System.out.println("You are " + age + " years old.");
    }//end main
}//end class