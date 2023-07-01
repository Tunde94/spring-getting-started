package ro.sda.spring._7.beans;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
//@Getter

public class Cat {
    @Value("Tom")
    private String name;

    public Cat() {
        System.out.println("Cat constructor was called.");
    }

    public void sayMeow() {
        System.out.println("Meow!");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
