package codegym.com.module2_accountname_wbe.validation.customer;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CodeCustomerValidation implements ConstraintValidator<CodeCustomerValid, String> {
    @Override
    public void initialize(CodeCustomerValid contactNumber) {
    }

    @Override
    public boolean isValid(String contactField, ConstraintValidatorContext cxt) {
        return contactField != null && contactField.matches("^KH-[0-9]{4}$");
    }
}
