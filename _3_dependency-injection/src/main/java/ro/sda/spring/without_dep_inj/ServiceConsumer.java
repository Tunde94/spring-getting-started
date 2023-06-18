package ro.sda.spring.without_dep_inj;

public class ServiceConsumer {
    private EmailService service = new EmailService();
    public void processMessage(String msg, String receiver){
        // do some message validation- manipulation logic
        service.sendEmail(msg, receiver);
    }

}
