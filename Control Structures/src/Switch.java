import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {

        int employeeId = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome, Enter your employee ID");
        employeeId = sc.nextInt();
        switch (employeeId) {
            case 100:
                System.out.println("Welcome CEO");
                break;
            case 200:
                System.out.println("Welcome Directory");
                break;
            default:
                System.out.println("Welcome Employee");
                break;
        }

    }
}