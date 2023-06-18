package ro.sda.spring.with_partial_dep_inj;

public class ServiceConsumer {
    private MessageService service;
    public ServiceConsumer(MessageService service){
        this.service = service;
    }
    public void processMessage(String msg, String receiver){
        // do some message validation- manipulation logic
        service.sendMessage(msg, receiver);
    }

}
