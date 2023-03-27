package io.github.Victor5H.dao;

import java.util.List;

import io.github.Victor5H.entities.Employee;

public interface EmployeeDAO {
	boolean insertEmp(Employee e);

	boolean deleteEmp(Long id);

	Employee getEmp(Long id);

	List<Employee> getAllEmp();

	void updateEmp(Employee e);
}
