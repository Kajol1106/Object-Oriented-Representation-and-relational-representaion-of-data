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
		
		Department dep = new Department();
		dep.setDname("HR");
		dep.setLocation("Pune");
		
		
		Employee emp1 = new Employee();
		emp1.setName("Vaishu");
		emp1.setSalary(1234567890);
		emp1.setDept(dep);	//associating dept with employee
		
		Employee emp2 = new Employee();
		emp2.setName("Divya");
		emp2.setSalary(987643);
		emp2.setDept(dep);
		
		//associatin employee with department
		
		dep.getEmployees().add(emp1);
		dep.getEmployees().add(emp2);
		
		em.getTransaction().begin();		
		
		em.persist(dep);
			
		em.getTransaction().commit();
		em.close();
		System.out.println("process is done......");

	}

}
