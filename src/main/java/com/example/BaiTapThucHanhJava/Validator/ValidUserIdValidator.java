package com.example.BaiTapThucHanhJava.Validator;

import com.example.BaiTapThucHanhJava.Validator.annotation.ValidUserId;
import com.example.BaiTapThucHanhJava.entity.User;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidUserIdValidator implements ConstraintValidator<ValidUserId, User> {
    @Override
    public boolean isValid(User user, ConstraintValidatorContext context){
        if(user == null)
            return true;
        return user.getId() != null;
    }
}
