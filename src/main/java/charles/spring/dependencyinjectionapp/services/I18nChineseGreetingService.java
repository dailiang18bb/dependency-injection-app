package charles.spring.dependencyinjectionapp.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("CN")
@Service("i18nService")
public class I18nChineseGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "你好世界! - CN";
    }
}
