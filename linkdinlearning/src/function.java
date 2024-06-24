import java.util.Scanner;

public class function {
    //writing function definition outside the main function
    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type in a random word and press Enter to start developer tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer tea time!");
    }
    //we can call or use our function in main function
    public static void main(String[] args) {
        announceDeveloperTeaTime();

    }
}
