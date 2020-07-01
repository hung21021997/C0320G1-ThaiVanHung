package codegym.com.module2_accountname_wbe.validation.customer;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AmountValidation implements ConstraintValidator<AmountValid, String> {
    @Override
    public void initialize(AmountValid contactNumber) {
    }

    @Override
    public boolean isValid(String contactField, ConstraintValidatorContext cxt) {
        return contactField != null && contactField.matches("^[0-9]+$");
    }
}
