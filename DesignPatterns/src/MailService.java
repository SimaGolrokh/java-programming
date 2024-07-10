public class MailService {
     public void sendEmail(){
         connect();
         authenticate();
         System.out.println("Sending email");
         disconnect();
     }
     private void connect(){
         System.out.println("Connecting");
     }
     private void disconnect(){
         System.out.println("Disconnecting");
     }
     private void authenticate(){
         System.out.println("Authenticating");
     }
}
