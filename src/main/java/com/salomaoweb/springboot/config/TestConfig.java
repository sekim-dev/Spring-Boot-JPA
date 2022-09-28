package com.salomaoweb.springboot.config;

import com.salomaoweb.springboot.repositories.UserRepository;
import com.salomaoweb.springboot.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {

        User u1 =new User(null,"salomao","salomao@me.com.br","111111111","12345");
        User u2 =new User(null,"Amanda","Amanda@me.com.br","222222222","67890");
        User u3 =new User(null,"Hugo","Hugo@me.com.br","33333333","24680");

        userRepository.saveAll(Arrays.asList(u1,u2,u3));
    }
}
