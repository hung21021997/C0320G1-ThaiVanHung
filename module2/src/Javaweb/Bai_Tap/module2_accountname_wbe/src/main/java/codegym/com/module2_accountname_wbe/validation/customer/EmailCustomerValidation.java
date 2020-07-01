package codegym.com.module2_accountname_wbe.validation.customer;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailCustomerValidation implements ConstraintValidator<EmailCustomerValid, String> {
    @Override
    public void initialize(EmailCustomerValid contactNumber) {
    }

    @Override
    public boolean isValid(String contactField, ConstraintValidatorContext cxt) {
        return contactField != null && contactField.matches("^([a-zA-Z0-9]+\\@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)+)$");
    }
}
