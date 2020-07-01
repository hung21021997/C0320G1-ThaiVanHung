package codegym.com.module2_accountname_wbe.validation.customer;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = NameCustomerValidation.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface NameCustomerValid {
    String message() default "Abc Xyz";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
