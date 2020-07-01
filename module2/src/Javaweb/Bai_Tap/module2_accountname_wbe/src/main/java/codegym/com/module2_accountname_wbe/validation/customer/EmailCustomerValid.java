package codegym.com.module2_accountname_wbe.validation.customer;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = EmailCustomerValidation.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface EmailCustomerValid {
    String message() default "abc@abc.abc";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
