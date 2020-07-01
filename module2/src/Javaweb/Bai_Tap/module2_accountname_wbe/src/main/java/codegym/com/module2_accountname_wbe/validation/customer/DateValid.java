package codegym.com.module2_accountname_wbe.validation.customer;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = DateValidation.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface DateValid {
    String message() default "DD/MM/YYYY";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
