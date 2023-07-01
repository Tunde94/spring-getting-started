package ro.sda.spring._7.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ro.sda.spring._7.beans.Cat;
import ro.sda.spring._7.beans.Owner;

@Configuration
public class ProjectConfig {
    @Bean
    @Scope(value = "prototype")
    public Cat cat(){
        return new Cat();
    }
    @Bean
    @Scope(value = "prototype")
    public Owner owner(){
        return new Owner();
    }
}
