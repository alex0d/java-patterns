package ru.alex0d;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

        Programmer programmer = applicationContext.getBean(args[0], Programmer.class);
        System.out.println(programmer.doCoding());
    }
}