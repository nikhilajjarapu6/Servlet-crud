package com.jsp.employeeserviece;

import java.util.List;

import com.jsp.employeedao.EmployeeDao;
import com.jsp.employeedto.Employee;

public class EmployeeService {
	EmployeeDao dao=new EmployeeDao();
	public Employee saveEmployee(Employee employee) {
		return dao.saveEmployee(employee);
	}
	public List<Employee> displayEMployee(){
		return dao.displayEmployees();
	}
	public Employee deleteEmployees(int id) {
		return dao.deleteEmployee(id);}
	public Employee getByIdEmployee(int id) {
		return dao.getByIdEmployee(id);
	}
	public Employee updateEmployee(Employee employee) {
		return dao.updateEmployee(employee);
	}

}
