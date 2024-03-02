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
@WebServlet("/getById")
public class GetByServlet extends HttpServlet  {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=(Integer.parseInt(req.getParameter("id")));
		
		EmployeeService ss=new EmployeeService();
		Employee emp=ss.getByIdEmployee(id);
		if(emp!=null) {
			req.setAttribute("getemployee", emp);
			RequestDispatcher rd= req.getRequestDispatcher("updateemployee.jsp");
			rd.forward(req, resp);
		}
		else {
			RequestDispatcher rd= req.getRequestDispatcher("editemployee.jsp");
			rd.include(req, resp);
		}
	}

}
