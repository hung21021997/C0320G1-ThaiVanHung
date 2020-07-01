package codegym.com.module2_accountname_wbe.validation.customer;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneCustomerValidation implements ConstraintValidator<PhoneCustomerValid, String> {
    @Override
    public void initialize(PhoneCustomerValid contactNumber) {
    }

    @Override
    public boolean isValid(String contactField, ConstraintValidatorContext cxt) {
        return contactField != null && contactField.matches("^(09[0-1][0-9]{7}|\\(84\\)\\+9[0-1][0-9]{7})$");
    }
}
