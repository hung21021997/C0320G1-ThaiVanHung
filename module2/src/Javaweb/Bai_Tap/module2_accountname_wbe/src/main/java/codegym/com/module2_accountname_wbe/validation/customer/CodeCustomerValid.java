package codegym.com.module2_accountname_wbe.validation.customer;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CodeCustomerValidation.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CodeCustomerValid {
    String message() default "KH-xxxx (x là số nguyên dương từ 0 đến 9)";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
