package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GettersGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Getters say hello";
    }
}
