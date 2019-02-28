package cinema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cinema.bean.Customer;

@Controller
public class LoginController {
	@RequestMapping(value = "/login", method = RequestMethod.GET) 
	public String displayLogin(Model model) { 
		 model.addAttribute("customer", new Customer());
	    return "login1"; 
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST) 
	public String login(Model model) { 
	    model.addAttribute("customer", new Customer()); 
	    return "login1"; 
	}

}
