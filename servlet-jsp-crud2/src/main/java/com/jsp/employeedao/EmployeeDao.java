package com.jsp.employeedao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.employeedto.Employee;

public class EmployeeDao {
EntityManagerFactory emf= Persistence.createEntityManagerFactory("nikhil");
	
	public Employee saveEmployee(Employee employee) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		if(employee!=null) {
		et.begin();
		em.persist(employee);
		et.commit();}
		return employee;
	}
	public List<Employee> displayEmployees(){
		EntityManager em = emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Query query=em.createQuery("select a from Employee a");
		return query.getResultList();
		
	}
	public Employee deleteEmployee(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Employee emp=em.find(Employee.class,id);
		
		if(emp!=null) {
			et.begin();
			em.remove(emp);
			et.commit();
		}
		return emp;
	}
	public Employee updateEmployee(Employee employee) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Employee emp=em.find(Employee.class,employee.getId());
		if(emp!=null) {
			et.begin();
			em.merge(employee);
			et.commit();
		}
		return emp;
		
		
	}
	
	public Employee getByIdEmployee(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		return em.find(Employee.class,id);
		
	}


}
