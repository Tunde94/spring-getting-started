package ro.sda.spring.with_partial_dep_inj;

public class SmsService implements MessageService{
    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("Sms sent to" + receiver + "with message " + message);

    }
}
