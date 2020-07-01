package codegym.com.module2_accountname_wbe.validation.customer;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DateValidation implements ConstraintValidator<DateValid, String> {
    @Override
    public void initialize(DateValid contactNumber) {
    }

    @Override
    public boolean isValid(String contactField, ConstraintValidatorContext cxt) {
        return contactField != null && contactField.matches("^((((0[1-9])|(1[0-9]))\\/((0[1-9])|(1[0-2])))|((2[0-8])\\/02)|((2[0-9])\\/((01)|(0[3-9])|(1[0-2])))|((30)\\/((01)|(0[3-9])|(1[0-2])))|((31)\\/(01|03|05|07|08|10|12)))\\/((190[0-9])|(19[1-9][0-9])|(20[0-2][0-9]))$");
    }
}
