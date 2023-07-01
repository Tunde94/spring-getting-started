package ro.sda.spring.services.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ro.sda.spring.services.NameService;
@Service(value="simple")//oarecum e ca si component
public class SimpleNameService implements NameService {
    @Override
    public String getName() {
        return "Ionut";
    }
}
