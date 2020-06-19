package com.example.demo;

import com.example.demo.demo.EnableAutoImport;
import com.example.demo.demo.OneClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableAutoImport
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
        OneClass one = run.getBean(OneClass.class);
        System.out.println(one);
    }

}
