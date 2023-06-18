package ro.sda.spring.with_partial_dep_inj;
public class Main {
    public static void main(String[] args) {
        ServiceConsumer email = new ServiceConsumer(new EmailService());
        email.processMessage("ALERT", "catalin@abc.com");

        ServiceConsumer sms = new ServiceConsumer(new SmsService());
        sms.processMessage("ALERT", "0741178888");

    }
}
