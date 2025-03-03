package com.api.feedback.initializer;


import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.api.feedback.models.EmployeeModel;
import com.api.feedback.repository.EmployeeRepository;

@Component
public class EmployeeInitializer implements CommandLineRunner {

    private final EmployeeRepository repository;
    private final PasswordEncoder passwordEncoder;

    // Construtor para injeção de dependências
    public EmployeeInitializer(EmployeeRepository repository, PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {
        // Cria o objeto Employee com a senha criptografada
        EmployeeModel employee = new EmployeeModel(1L, "John", "River", "1122", "john@gmail.com", 
                                                   passwordEncoder.encode("123"), "Aprendicce", "Male");

        // Salva o funcionário no banco de dados
        repository.save(employee);

        // Mensagens para confirmação
        System.out.println("Usuário criado");
        System.out.println(employee); // Exibe o objeto employee (pode ser útil para debug)
    }

    
}
