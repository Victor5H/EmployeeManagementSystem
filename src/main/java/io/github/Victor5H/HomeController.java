package io.github.Victor5H;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

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
	static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("dd/MM/yyyy");
	}

	@RequestMapping(path = "/")
	public String index() {
		return "index";

	}

	@RequestMapping(path = "empRegister")
	public String empRegister() {
		return "empRegistration";

	}

	@RequestMapping(path = "showAll")
	public String showAll(Model m) {
		m.addAttribute("list", employeeService.getAllEmployees());
		m.addAttribute("df", sdf);
		return "showAll";
	}

	@RequestMapping(path = "emp/{id}")
	public String emp(@PathVariable("id") long id, Model m) {
		Employee employee = employeeService.getEmployee(id);
		if (employee == null)
			return "notFound";
		m.addAttribute("emp", employee);
		m.addAttribute("df", sdf);
		return "empDisplay";
	}

	@RequestMapping(path = "empSearch")
	public RedirectView empSearch(@RequestParam("id") long id) {
		RedirectView rv = new RedirectView();
		rv.setUrl("emp/" + id);
		return rv;
	}

	@RequestMapping(path = "postEmp", method = RequestMethod.POST)
	public String empPost(@ModelAttribute Employee e, Model m) {
		Address address = e.getAddress();
		System.out.println(e.getDate());
		addressService.insertAddress(address);
		employeeService.insertEmployee(e);
		m.addAttribute("emp", e);
		m.addAttribute("df", sdf);
		return "empDisplay";
	}

	@RequestMapping(path = "emp/updateEmp/postEmpUpdate", method = RequestMethod.POST)
	public String empPostUpdate(@ModelAttribute Employee e, Model m) {
		System.out.println(e);
		Address address = e.getAddress();
//		address.setId(2);
		addressService.updateAddress(address);
//		e.setId(3);
		employeeService.updateEmployee(e);
		m.addAttribute("emp", e);
		return "empDisplay";

	}

	@RequestMapping(path = "emp/updateEmp/{id}")
	public String updateEmp(@PathVariable("id") String id, Model m) {
		m.addAttribute("emp", employeeService.getEmployee(Long.parseLong(id)));
		m.addAttribute("df", sdf);
		return "updateEmp";
	}

	@RequestMapping(path = "deleteEmp/{id}")
	public RedirectView deleteEmp(@PathVariable("id") Long id) {
		Employee e = employeeService.getEmployee(id);
		employeeService.deleteEmployee(id);
		addressService.deleteAddress(e.getAddress().getId());
		RedirectView rdView = new RedirectView();
		rdView.setUrl("../showAll");
		return rdView;
	}
}
