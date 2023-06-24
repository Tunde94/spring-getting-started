package ro.sda.spring._6.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Owner {

    private String name;

    private Cat cat;

    //constructor injection
    public Owner(@Value("Messi") String name, Cat cat) {
        this.cat = cat;
        System.out.println("Owner constructor called");
    }
}
