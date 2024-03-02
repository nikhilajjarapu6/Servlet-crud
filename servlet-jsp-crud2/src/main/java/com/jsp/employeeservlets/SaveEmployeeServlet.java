package com.jsp.employeeservlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.employeedto.Employee;
import com.jsp.employeeserviece.EmployeeService;
@WebServlet("/save")
public class SaveEmployeeServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Employee emp=new Employee();
		emp.setName(req.getParameter("name"));
		emp.setEmail(req.getParameter("email"));
		emp.setPassword(req.getParameter("password"));
		emp.setSal(Integer.parseInt(req.getParameter("sal")));
		EmployeeService ss=new EmployeeService();
		Employee emp1=ss.saveEmployee(emp);
		if(emp1!=null) {
			RequestDispatcher rd=req.getRequestDispatcher("EmployeePage.jsp");
			rd.forward(req, resp);
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("saveemployee.jsp");
			rd.include(req, resp);
		}
		
	}
	

}
