package com.kodilla.spring.basic.dependency_injection;

public class SimpleApplicationRunner {
    public static void main(String[] args) {
        SimpleApplication simpleApplication = new SimpleApplication(new SkypeMessageService());
        simpleApplication.processMessage("Test message", "reveiver@mail.com");
    }
}
