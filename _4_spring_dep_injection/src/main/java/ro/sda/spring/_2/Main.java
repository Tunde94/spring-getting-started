package ro.sda.spring._2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring._2.config.ProjectConfig;
import ro.sda.spring._2.beans.Dog;
import ro.sda.spring._2.beans.Owner;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)){
            //try special, Closable - nu mai trebuie sa implementam finaly, inchide contextul in spate
            Owner o1 = context.getBean("owner1", Owner.class);
            System.out.println(o1);

            Owner o2 = context.getBean("owner2", Owner.class);
            System.out.println(o2);

            Dog d1 = o1.getDog();
            System.out.println(d1);

            Dog d2 = o1.getDog();
            System.out.println(d2);

            Dog d3 = context.getBean(Dog.class);
            System.out.println(d3);
        }
    }
}
