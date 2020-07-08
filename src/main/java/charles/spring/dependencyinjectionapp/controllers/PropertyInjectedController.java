package charles.spring.dependencyinjectionapp.controllers;

import charles.spring.dependencyinjectionapp.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
