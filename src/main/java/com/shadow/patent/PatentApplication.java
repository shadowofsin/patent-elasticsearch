package com.shadow.patent;

import org.springframework.boot.SpringApplication;
import com.shadow.patent.inits.ElasticSearchInit;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

/**
 * Hello world!
 */
@Slf4j
@SpringBootApplication
public class PatentApplication {
    public static void main(String[] args) {
        SpringApplication.run(PatentApplication.class, args);
        SpringApplication springApplication = new SpringApplication(PatentApplication.class);
        springApplication.addListeners(new ElasticSearchInit());
    }
}
