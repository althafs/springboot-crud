package com.vir.springboot.service;

import java.util.List;

import com.vir.springboot.model.Employee;
import org.springframework.data.domain.Page;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
}