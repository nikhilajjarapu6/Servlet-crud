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
@WebServlet("/removeemployee")
public class DeleteEmployeeServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmployeeService ss=new EmployeeService();
		Employee emp=ss.deleteEmployees(Integer.parseInt(req.getParameter("name1")));
		if(emp!=null) {
			RequestDispatcher rd=req.getRequestDispatcher("EmployeePage.jsp");
			rd.forward(req, resp);
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("EmployeePage.jsp");
			rd.include(req, resp);
		}
	}

}
