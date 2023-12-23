package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingServiceImpl;

public class ConstructorInjectedProperty {

    private  final GreetingServiceImpl greetingService;

    public ConstructorInjectedProperty(GreetingServiceImpl greetingService) {
        this.greetingService = greetingService;
    }

    public String SayHello(){
        return greetingService.sayGreeting();
    }
}
