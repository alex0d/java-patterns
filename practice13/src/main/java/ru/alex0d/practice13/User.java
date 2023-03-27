package ru.alex0d.practice13;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Value("${student.name}")
    private String name;

    @Value("${student.last_name}")
    private String lastname;

    @Value("${student.group}")
    private String group;

    @PostConstruct
    public void init() {
        System.out.println(name + " " + lastname + " " + group);
    }
}
