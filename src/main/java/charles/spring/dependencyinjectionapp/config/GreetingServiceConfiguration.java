package charles.spring.dependencyinjectionapp.config;


import charles.spring.dependencyinjectionapp.services.GreetingRepository;
import charles.spring.dependencyinjectionapp.services.GreetingService;
import charles.spring.dependencyinjectionapp.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfiguration {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository){
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Primary
    @Profile({"default", "EN"})
    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("EN");
    }

    @Bean
    @Primary
    @Profile("ES")
    GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("ES");
    }

    @Bean
    @Primary
    @Profile("DE")
    GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("DE");
    }

}
