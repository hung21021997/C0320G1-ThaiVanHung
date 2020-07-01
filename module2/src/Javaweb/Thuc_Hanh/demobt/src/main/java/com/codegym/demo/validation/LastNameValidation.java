package com.codegym.demo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LastNameValidation implements ConstraintValidator<LastNameValid, String> {

    @Override
    public void initialize(LastNameValid contactNumber) {
    }

    @Override
    public boolean isValid(String contactField,
                           ConstraintValidatorContext cxt) {
        return contactField != null && contactField.matches("[a-zA-Z]{1,7}");
    }

}
