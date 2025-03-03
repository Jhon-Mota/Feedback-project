package com.api.feedback.initializer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.api.feedback.models.ChiefModel;
import com.api.feedback.repository.ChiefRepository;

@Component
public class ChiefInitializer implements CommandLineRunner{

    private final ChiefRepository repository;
    private final PasswordEncoder passwordEncoder;

    public ChiefInitializer(ChiefRepository repository, PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    public void run(String... args) throws Exception {

        ChiefModel chief = new ChiefModel(null, "Gaby", "Almeida", "5555", "gaby@gmail.com", 
        passwordEncoder.encode("123"), "Head of Packaging Development", "Female");

        repository.save(chief);

        System.out.println("Chief created");

    }
    


}
