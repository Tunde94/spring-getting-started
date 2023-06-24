package ro.sda.spring._1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring._1.beans.Cat;
import ro.sda.spring._1.components.Dog;
import ro.sda.spring._1.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            //resursa!
            Cat c1 = context.getBean(Cat.class);
            c1.sayMeow();
            Cat c2 = context.getBean(Cat.class);
            c2.sayMeow();

            Dog d1 = context.getBean(Dog.class);
            d1.sayHam();
            Dog d2 = context.getBean(Dog.class);
            d2.sayHam();

        }
    }
}
