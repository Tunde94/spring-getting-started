package ro.sda.spring.services.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ro.sda.spring.services.NameService;

import java.util.List;
import java.util.Random;

@Service(value = "random")
@Primary
public class RandomNameService implements NameService {

    @Override
    public String getName() {
        List<String> names = List.of("Ionut","Gheorghe","Calin","Catalin","George","Constantin","Vasile","Mihai");
        Random r = new Random();
        return names.get(r.nextInt(8));
    }
}
