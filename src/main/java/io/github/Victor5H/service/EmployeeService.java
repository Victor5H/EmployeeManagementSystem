package io.github.Victor5H.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.Victor5H.dao.EmployeeDAO;
import io.github.Victor5H.entities.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDAO employeeDAO;

	public EmployeeDAO getEmployeeDAO() {
		return employeeDAO;
	}

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public Employee getEmployee(Long id) {
		return employeeDAO.getEmp(id);
	}

	public List<Employee> getAllEmployees() {
		return employeeDAO.getAllEmp();
	}

	public void updateEmployee(Employee e) {
		employeeDAO.updateEmp(e);
	}

	public boolean insertEmployee(Employee e) {
		return employeeDAO.insertEmp(e);
	}

	public boolean deleteEmployee(Long id) {
		return employeeDAO.deleteEmp(id);
	}
}
