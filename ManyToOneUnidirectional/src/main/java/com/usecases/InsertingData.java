package com.usecases;

import javax.persistence.EntityManager;
import com.model.Department;
import com.model.Employee;
import com.utility.EMUtil;

public class InsertingData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = EMUtil.provideEntityManager();
		
		Department dept = new Department();
		dept.setDname("HR");
		dept.setLocation("Pune");
		
		Employee emp1 = new Employee();
		emp1.setName("Kaju");
		emp1.setSalary(1234567);
		emp1.setDept(dept);
		
		Employee emp2 = new Employee();
		emp2.setName("Ram");
		emp2.setSalary(234567);
		emp2.setDept(dept);
		
		em.getTransaction().begin();
		//in many to one relation no need to persist parent object
		//in this relation 3rd table will not created.
		em.persist(emp2);
		em.persist(emp1);		
		em.getTransaction().commit();
		em.close();
		System.out.println("process is done......");

	}

}
