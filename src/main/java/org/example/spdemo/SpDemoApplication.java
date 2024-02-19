package org.example.spdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SpDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpDemoApplication.class, Arrays.toString(args));
    }

}
