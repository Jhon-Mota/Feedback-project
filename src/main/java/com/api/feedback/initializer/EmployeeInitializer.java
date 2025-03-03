package com.api.feedback.initializer;

/* 
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.api.feedback.models.EmployeeModel;
import com.api.feedback.repository.EmployeeRepository;

*/

/* 
@Component
public class EmployeeInitializer implements CommandLineRunner {

    private final EmployeeRepository repository;
    private final PasswordEncoder passwordEncoder;

    public EmployeeInitializer(EmployeeRepository repository, PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {
        
        EmployeeModel employee = new EmployeeModel(null, "John", "River", "1122 ", "john@gmail.com", 
                                                        passwordEncoder.encode("123"), "Aprendice", "Male");
        
        repository.save(employee);

        System.out.println("Employee created");
    }
}

*/