package codegym.com.module2_accountname_wbe.validation.customer;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CmndCustomerValidation.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CmndCustomerValid {
    String message() default "xxxxxxxxx or xxxxxxxxxxxx (x là số nguyên dương từ 0 đến 9)";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
