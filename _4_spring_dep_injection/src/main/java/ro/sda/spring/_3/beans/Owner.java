package ro.sda.spring._3.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Owner {
    private String name;

    //field based injection
    //field injection is not recommended because it is harder to test(we need to use reflection to test)
    @Autowired
    private Dog dog;
    public Owner(){
        System.out.println("Owner constructor called!!!");
    }

    public Owner(String name, Dog dog) {
        this.name = name;
        this.dog = dog;
    }

    public Owner(String name) {
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

    public void setDog(Dog dog) {
        this.dog = dog;
    }
    public void walkDog(){
        System.out.println("Owner " + name + "has taken his dog" + dog.getName() + "out for a walk.");
    }
}
