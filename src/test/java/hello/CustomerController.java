package hello;

import javax.annotation.Resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class CustomerController {
	
	
	@Resource
	CustomerRepository customerRepo; // Gives us the ability to inject repo
	
	
	@RequestMapping("/customers")
	public String showAllCustomers(Model model) {
		model.addAttribute("customers", customerRepo.findAll()); // find all built in with CRUD being attached to repo
		return "customers";
	}
	
	
	

}