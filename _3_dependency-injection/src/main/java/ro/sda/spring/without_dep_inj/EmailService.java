package ro.sda.spring.without_dep_inj;

/**
 * EmailService class that holds the logic to send email message to recipient mail address
 */
public class EmailService {
    public void sendEmail(String message, String receiver){
        //logic to sent mail
        System.out.println("Email sent to" + receiver + "with message " + message);
    }
}
