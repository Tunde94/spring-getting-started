package ro.sda.spring._4.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Owner {
    @Value("John")//injectam valoare cu @Value
    private String name;
    private Dog dog;

    public Owner() {
        System.out.println("Owner constructor called.");
        //this.name = "John";
    }

    public String getName() {
        return name;

    }


    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }
    //setter based injection - we use setter with @Autowired to inject the Dog dependency

    @Autowired
    public void setDog(Dog dog) {
        System.out.println("Injecting dog dependency using setter");
        this.dog = dog;
    }


    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", dog=" + dog +
                '}';
    }
}
