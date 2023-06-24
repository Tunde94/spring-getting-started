package ro.sda.spring._6.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component//fara @Component: exception!
public class Cat {
    @Value("Tom")
    private String name;

    public Cat() {
        System.out.println("Cat constructor was called.");
    }

    public void sayMeow() {
        System.out.println("Meow!");
    }
}
