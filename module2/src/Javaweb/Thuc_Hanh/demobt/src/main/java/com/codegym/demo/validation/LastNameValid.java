package com.codegym.demo.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = LastNameValidation.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface LastNameValid {
    String message() default "Invalid last name";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
