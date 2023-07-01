package ro.sda.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring.config.ProjectConfiguration;
import ro.sda.spring.services.HelloService;
import ro.sda.spring.services.NameService;
import ro.sda.spring.services.impl.RandomNameService;
import ro.sda.spring.services.impl.SimpleNameService;

import javax.lang.model.element.Name;

public class Main {
    public static void main(String[] args) {
        //try with resources
        try (var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class)){
            /*NameService myService = context.getBean(SimpleNameService.class);//cauta in context, daca ai bean de tip SimpleNameService
            System.out.println("Name of my simple service is : " + myService.getName());

            NameService myRandomService = context.getBean(RandomNameService.class);
            System.out.println("Name of my random service is : " + myRandomService.getName());

            NameService random = context.getBean("random",NameService.class);
            System.out.println("Name of my random service is : " + random.getName());

            NameService simple = context.getBean("simple",NameService.class);
            System.out.println("Name of my random service is : " + simple.getName());
*/
            HelloService helloService = context.getBean(HelloService.class);
            helloService.sayHello();



        }
    }
}