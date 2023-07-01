package ro.sda.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring.config.ProjectConfig;
import ro.sda.spring.services.MathService;

public class Main {
    public static void main(String[] args) {
        try (var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            MathService service = ctx.getBean(MathService.class);
            try {
                service.add(5, 5);
            } catch (RuntimeException ignored) {
            }
            System.out.println("_______________________");
            try {
                service.divide(2, 0);
            } catch (RuntimeException ignored) {
            }
            System.out.println("_______________________");

            try {
                service.multiply(5, 5);
            } catch (RuntimeException ignored) {
            }
            System.out.println("_______________________");

            try {
                service.substract(5, 5);
            } catch (RuntimeException ignored) {
            }
            System.out.println("_______________________");

            System.out.println("Context is closing");
        }

    }
}