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
		
		dep.getEmployees().add(emp1);
		dep.getEmployees().add(emp2);
		
		em.getTransaction().begin();		
		
//		em.persist(emp1);
//		em.persist(emp2);
		//here if you want to persist employee details without persisting emp1 and emp2 only persist the parent entity class object then you have to define the 
		//cascadeType.ALL int relationship annotaion. ex., @OneToMany(cascade = CascadeType.ALL)	
		em.persist(dep);
		
		
		em.getTransaction().commit();
		em.close();
		System.out.println("process is done......");

	}

}
