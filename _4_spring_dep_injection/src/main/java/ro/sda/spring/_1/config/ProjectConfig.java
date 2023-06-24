package ro.sda.spring._1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ro.sda.spring._1.beans.Cat;

@Configuration//vrem sa fie aceasta clasa sa fie vazuta ca o clasa configuration
@ComponentScan(basePackages = "ro.sda.spring._1.components")
public class ProjectConfig {
    @Bean//componente menegeriate de framework
    //by manage we understand that this component is going to be registered in application context
    public Cat cat123(){
        System.out.println("Cat bean is creating ");
        return new Cat();
    }

}

