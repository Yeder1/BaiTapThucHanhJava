package com.example.BaiTapThucHanhJava.Validator;

import com.example.BaiTapThucHanhJava.repository.IUserRepository;
import com.example.BaiTapThucHanhJava.Validator.annotation.ValidUsername;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class ValidUsernameValidator implements ConstraintValidator<ValidUsername, String> {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public void initialize(ValidUsername constraintAnnotation) {
        // Initialization logic if needed
    }

    @Override
    public boolean isValid(String username, ConstraintValidatorContext context) {
        if (userRepository == null) {
            return true;
        }
        return userRepository.findByUsername(username) == null;
    }
}
