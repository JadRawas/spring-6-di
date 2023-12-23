package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedPropertyTest {

    ConstructorInjectedProperty controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedProperty(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println(controller.SayHello());

    }
}