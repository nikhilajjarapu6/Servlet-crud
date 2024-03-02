package com.jsp.employeeservlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.employeedto.Employee;
import com.jsp.employeeserviece.EmployeeService;
@WebServlet("/displayemployee")
public class DisplayEmployeeServlets extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmployeeService ss=new EmployeeService();
		List<Employee> li  =ss.displayEMployee();
		if(li!=null) {
		req.setAttribute("display", li);
		RequestDispatcher rd=req.getRequestDispatcher("displayemployee.jsp");
		rd.forward(req, resp);
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("EmployeePage.jsp");
			rd.include(req, resp);
		}

	}

}
