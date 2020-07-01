package codegym.com.module2_accountname_wbe.validation.customer;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CmndCustomerValidation implements ConstraintValidator<CmndCustomerValid, String> {
    @Override
    public void initialize(CmndCustomerValid contactNumber) {
    }

    @Override
    public boolean isValid(String contactField, ConstraintValidatorContext cxt) {
        return contactField != null && contactField.matches("^[0-9]{9}|[0-9]{12}$");
    }
}
