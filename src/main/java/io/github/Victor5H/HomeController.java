package io.github.Victor5H;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.github.Victor5H.entities.Address;
import io.github.Victor5H.entities.Employee;
import io.github.Victor5H.service.AddressService;
import io.github.Victor5H.service.EmployeeService;

@Controller
public class HomeController {
	@Autowired
	EmployeeService employeeService;
	@Autowired
	AddressService addressService;

	@RequestMapping(path = "/")
	public String index() {
		return "index";

	}

	@RequestMapping(path = "empRegister")
	public String empRegister() {
		return "empRegistration";

	}

	@RequestMapping(path = "postEmp", method = RequestMethod.POST)
	public String empPost(@ModelAttribute Employee e, Model m) {
		Address address = e.getAddress();
		addressService.insertAddress(address);
		employeeService.insertEmployee(e);
		m.addAttribute("emp", e);
		return "empDisplay";

	}
}
