package ro.sda.spring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ro.sda.spring.model.Product;

// we annotated the class with @Slf4j in order to have a static Logger variable named "log" (log.info...)
@Slf4j
@RestController
public class ProductController {

    // fatal
    // error
    // warn
    // info
    // debug
    // trace

    @PostMapping("/product")
    public void addProduct(@RequestBody Product p) {
        log.info("Product received {}", p);
    }

}

