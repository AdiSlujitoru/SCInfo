package cinema.validators;

import cinema.bean.Customer;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class RegistrationValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return Customer.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {

        Customer customer = (Customer) o;
        if (customer.getFirstName() == null || customer.getFirstName().equals("")) {

            errors.rejectValue("firstName", "customer.firstName", "First Name is null or empty");
        }
        if (customer.getLastName() == null || customer.getLastName().equals("")) {

            errors.rejectValue("lastName", "customer.lastName", "Last Name is null or empty");
        }
        if (customer.getEmail() == null || customer.getEmail().equals("")) {

            errors.rejectValue("email", "customer.email", "Email is null or empty");
        }
        if (customer.getUserName() == null || customer.getUserName().equals("")) {

            errors.rejectValue("userName", "customer.userName", "User Name is null or empty");
        }
        if (customer.getPassword() == null || customer.getPassword().equals("")) {

            errors.rejectValue("password", "customer.password", "Password is null or empty");
        }

    }
}
