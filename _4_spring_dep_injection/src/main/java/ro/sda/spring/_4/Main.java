package ro.sda.spring._4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring._4.components.Dog;
import ro.sda.spring._4.components.Owner;
import ro.sda.spring._4.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)){
            Owner o = context.getBean(Owner.class);
            System.out.println(o);

            Dog d = o.getDog();
            System.out.println(d);

            Dog d2 = context.getBean(Dog.class);
            System.out.println(d2);
        }
    }
}
