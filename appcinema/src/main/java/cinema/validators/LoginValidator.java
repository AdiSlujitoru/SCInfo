package cinema.validators;

import cinema.bean.Customer;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class LoginValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return Customer.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {


        Customer customer = (Customer) o;

        if (customer.getUserName() == null || customer.getUserName().equals("")) {

            errors.rejectValue("userName", "customer.userName", "User Name is null or empty");
        }
        if (customer.getPassword() == null || customer.getPassword().equals("")) {

            errors.rejectValue("password", "customer.password", "Password is null or empty");
        }

    }
}
