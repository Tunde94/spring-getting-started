package ro.sda.spring._7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring._7.beans.Cat;
import ro.sda.spring._7.beans.Owner;
import ro.sda.spring._7.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        try (var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            Cat c1 = ctx.getBean(Cat.class);
            c1.sayMeow();
            System.out.println("Cat1: " + c1);

            Owner o1 = ctx.getBean(Owner.class);
            Cat c2 = o1.getCat();
            System.out.println("Cat2: " + c2);

            Cat c3 = ctx.getBean(Cat.class);
            c3.sayMeow();
            System.out.println("Cat3: " + c3);

            Owner o2 = ctx.getBean(Owner.class);
            Cat c4 = o2.getCat();
            System.out.println("Cat4: " + c4);





        }
    }
}
