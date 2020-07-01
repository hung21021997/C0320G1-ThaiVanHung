package codegym.com.module2_accountname_wbe.validation.customer;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NameCustomerValidation implements ConstraintValidator<NameCustomerValid, String> {
    @Override
    public void initialize(NameCustomerValid contactNumber) {
    }

    @Override
    public boolean isValid(String contactField, ConstraintValidatorContext cxt) {
        return contactField != null && contactField.matches("^(([A-Z][a-z]+)+( [A-Z][a-z]+)*)$");
    }
}
