package hello;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller // DONT FORGET ANNOTATION
public class CustomerController {
	
	
	@Resource
	CustomerRepository customerRepo; // Gives us the ability to inject repo into controller
	
	
	@RequestMapping("/customers")
	public String showAllCustomers(Model model) {
		model.addAttribute("customers", customerRepo.findAll()); // find all built in with CRUD being attached to repo
		return "customers";
	}
	
	@RequestMapping("/sorted-customers")
	public String showAllCustomersSorted(Model model) {
		model.addAttribute("customers", customerRepo.findAllByOrderByLastNameAsc()); // find all built in with CRUD being attached to repo
		return "customers";
	}

	@RequestMapping("/first-three-customers")
	public String showAllFirstThreeCustomers(Model model) {
		model.addAttribute("customers", customerRepo.findFirst3ByOrderByLastNameAsc()); // find all built in with CRUD being attached to repo
		return "customers";
	}
	

}
