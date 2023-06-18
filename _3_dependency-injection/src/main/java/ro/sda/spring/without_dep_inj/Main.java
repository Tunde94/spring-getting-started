package ro.sda.spring.without_dep_inj;

public class Main {
    public static void main(String[] args) {
        ServiceConsumer serviceConsumer = new ServiceConsumer();
        serviceConsumer.processMessage("ALERT", "catalin@abc.com");
    }
}