package charles.spring.dependencyinjectionapp.services;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {

        switch (lang){
            case "EN":
                return new PrimaryGreetingService(greetingRepository);
            case "DE":
                return new PrimaryGermanGreetingService(greetingRepository);
            case "ES":
                return new PrimarySpanishGreetingService(greetingRepository);
            default:
                return new PrimaryGreetingService(greetingRepository);
        }
    }
}
