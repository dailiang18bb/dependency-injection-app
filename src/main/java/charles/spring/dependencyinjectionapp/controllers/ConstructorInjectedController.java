package charles.spring.dependencyinjectionapp.controllers;

import charles.spring.dependencyinjectionapp.services.GreetingService;

public class ConstructorInjectedController {

    private  final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
