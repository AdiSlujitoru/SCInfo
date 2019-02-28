package cinema.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import cinema.bean.Customer;

@Service
public class LoginService {
	/*@Autowired
	RestTemplate restTemplate;

	public boolean validateLogin(Customer customer) {

		ResponseEntity<Customer> responseEntity = restTemplate.postForEntity("http://localhost:8085/customer", customer,
				Customer.class);

		if (responseEntity.getBody().getPassword() == null) {
			return false;
		} else
			return (customer.getUserName().equals(responseEntity.getBody().getUserName())
					&& customer.getPassword().equals(responseEntity.getBody().getPassword()));

	}*/
}
