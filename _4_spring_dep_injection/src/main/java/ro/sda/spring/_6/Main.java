package ro.sda.spring._6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring._6.components.Cat;
import ro.sda.spring._6.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        try (var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            Cat c = ctx.getBean(Cat.class);
            c.sayMeow();
        }
    }

}
