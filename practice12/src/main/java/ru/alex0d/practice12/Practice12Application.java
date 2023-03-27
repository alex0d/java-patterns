package ru.alex0d.practice12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Practice12Application {

    public static void main(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException("Specify input and output file names");
            // Sample: data/input.txt data/hashed.txt
        }
        SpringApplication.run(Practice12Application.class, args);
    }
}
