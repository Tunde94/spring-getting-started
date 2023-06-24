package ro.sda.spring._3.beans;



public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public Dog() {
        System.out.println("Dog constructor called!!!");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
