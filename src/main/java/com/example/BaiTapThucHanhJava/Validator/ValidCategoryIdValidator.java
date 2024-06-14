package com.example.BaiTapThucHanhJava.Validator;

import com.example.BaiTapThucHanhJava.Validator.annotation.ValidCategoryId;
import com.example.BaiTapThucHanhJava.entity.Category;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context){
        return category != null && category.getId() != null ;
    }
}
