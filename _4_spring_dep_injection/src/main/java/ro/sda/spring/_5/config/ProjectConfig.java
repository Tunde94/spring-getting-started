package ro.sda.spring._5.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ro.sda.spring._5.beans.Dog;
import ro.sda.spring._5.beans.Owner;

@Configuration
public class ProjectConfig {

    public ProjectConfig() {
        System.out.println("Project config initialized");
    }

    @Bean
    public Dog dog(){
        return new Dog();
    }

    @Bean
    public Owner owner(){
        return new Owner();
    }
}
