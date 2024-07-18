import static java.awt.SystemColor.control;

public class Main {
    public static void main(String[] args) {

        var account = new Account();
        account.deposit(100);
        account.withdraw(50);

        var mailService = new MailService();
        mailService.sendEmail();

        drawUIControl(new CheckBox());

        public static void drawUIControl(UIControl control){
            control.draw();
        }
    }

}
