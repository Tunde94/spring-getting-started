package ro.sda.spring.with_partial_dep_inj;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String msg, String receiver) {
        System.out.println("Email sent to" + receiver + "with message " + msg);
    }

}
