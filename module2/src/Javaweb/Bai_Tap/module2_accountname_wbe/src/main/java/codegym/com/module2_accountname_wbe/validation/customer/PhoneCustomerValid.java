package codegym.com.module2_accountname_wbe.validation.customer;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PhoneCustomerValidation.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface PhoneCustomerValid {
    String message() default "090xxxxxxx or 091xxxxxxx or (84)+90xxxxxxx or (84)+91xxxxxxx (x là số nguyên dương từ 0 đến 9)";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
