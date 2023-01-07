package com.usecases;

import javax.persistence.CascadeType;
import javax.persistence.EntityManager;
import javax.persistence.OneToMany;

import com.model.Department;
import com.model.Employee;
import com.utility.EMUtil;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = EMUtil.provideEntityManager();
		
		Employee emp1 = new Employee();
		emp1.setName("Vaishu");
		emp1.setSalary(1234567890);
		
		Employee emp2 = new Employee();
		emp2.setName("Divya");
		emp2.setSalary(987643);
		
		//associatin employee with department
		Department dep = new Department();
		dep.setDname("HR");
		dep.setLocation("Pune");
		
		Department dep2 = new Department();
		dep2.setDname("MR");
		dep2.setLocation("Mumbai");
		
		
		//association 1 department with two employees
		dep.getEmployees().add(emp1);
		dep.getEmployees().add(emp2);
		
		
		//association two employees with one department
		emp1.getDepartments().add(dep2);
		emp2.getDepartments().add(dep2);
		
		//assume one person is working in 2 department
		emp2.getDepartments().add(dep2);
		dep2.getEmployees().add(emp2);
		
		em.getTransaction().begin();		
		
		//here u can persiste emp1 and emp2 or dep1 and dep2
		em.persist(dep2);
		em.persist(dep);
		
		
		em.getTransaction().commit();
		em.close();
		System.out.println("process is done......");

	}

}
