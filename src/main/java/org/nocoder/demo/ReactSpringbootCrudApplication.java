package org.nocoder.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author yangjl
 */
@EnableCaching
@SpringBootApplication
public class ReactSpringbootCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactSpringbootCrudApplication.class, args);
    }

}
