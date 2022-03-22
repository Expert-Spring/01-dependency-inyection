package com.juandieruiz.di.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevEnvironment implements EnvironmentService {
    @Override
    public String getEnviroment() {
        return "Dev";
    }
}
