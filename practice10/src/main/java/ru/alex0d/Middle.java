package ru.alex0d;

import org.springframework.stereotype.Component;

@Component
public class Middle implements Programmer {
    @Override
    public String doCoding() {
        return "Coding like a middle...";
    }
}
